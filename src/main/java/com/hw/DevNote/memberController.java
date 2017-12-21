package com.hw.DevNote;

import java.util.Locale;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hw.DevNote.model.MemberVO;
import com.hw.DevNote.persistence.MemberDAO;

@Controller
public class memberController {
	private static final Logger logger = LoggerFactory.getLogger(memberController.class);
	
	@Inject
	private MemberDAO dao;
	
	@ResponseBody
	@RequestMapping(value = "/member/{memID}", method = RequestMethod.GET, produces = "application/json; charset=utf8")
	public String getList(@PathVariable String memID) {
		MemberVO vo = dao.get(memID);
		System.out.println(vo);
		return vo.toJsonString();
	}
	
	@RequestMapping(value = "/member", method = RequestMethod.POST)
	public String postList(Locale locale, Model model) {
		
		MemberVO vo = new MemberVO();
		vo.setMemID("");
		
		dao.register(vo);
		
		model.addAttribute("methodNm", "POST");
		
		return "list";
	}
}
