package com.hw.DevNote.persistence;

import org.springframework.stereotype.Repository;

import com.hw.DevNote.model.MemberVO;

@Repository
public class MemberDAOImpl extends GenericDAOImpl<MemberVO, String> implements MemberDAO{

}
