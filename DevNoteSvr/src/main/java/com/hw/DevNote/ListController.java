package com.hw.DevNote;

import java.util.Locale;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hw.DevNote.persistence.MemberDAO;

@Controller
public class ListController {
	private static final Logger logger = LoggerFactory.getLogger(ListController.class);
	
	@Inject
	private MemberDAO dao;
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String getList(Locale locale, Model model) {
		
		model.addAttribute("methodNm", dao.get("bluejin"));
		
		return "list";
	}
	
	@RequestMapping(value = "/list", method = RequestMethod.POST)
	public String postList(Locale locale, Model model) {
		
		model.addAttribute("methodNm", "POST");
		
		return "list";
	}
}
