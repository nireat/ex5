package com.choa.member;

import javax.servlet.http.HttpSession;

public interface MemberService {

	//join
	public int memberJoin(MemberDTO memberDTO, HttpSession session) throws Exception;
	
	//login
	public MemberDTO memberLogin(MemberDTO memberDTO) throws Exception;
	
	//page
	public MemberDTO memberPage(MemberDTO memberDTO) throws Exception;
}
