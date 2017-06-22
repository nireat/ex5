package com.choa.member.student;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.choa.member.MemberDTO;
import com.choa.member.MemberService;
import com.choa.util.FileSaver;

@Service
public class StudentServiceImpl implements MemberService{
	
	@Autowired
	private StudentDAOImpl studentDAOImpl;
	
	
	@Override
	public int memberJoin(MemberDTO memberDTO, HttpSession session) throws Exception {
		FileSaver fileSaver = new FileSaver();
		
		//System.out.println(memberDTO.getF1().getOriginalFilename());
		memberDTO.setOriname(memberDTO.getF1().getOriginalFilename());
		memberDTO.setFilename(fileSaver.filesave(session.getServletContext().getRealPath("resources/upload"), memberDTO.getF1()));
		//System.out.println(session.getServletContext().getRealPath("resources/upload"));
		return studentDAOImpl.memberJoin(memberDTO);
		
	}
	
	@Override
	public MemberDTO memberLogin(MemberDTO memberDTO) throws Exception {
		return studentDAOImpl.test(memberDTO);
	}
	
	@Override
	public MemberDTO memberPage(MemberDTO memberDTO) throws Exception {
	
		return studentDAOImpl.memberPage(memberDTO.getId());
	}
	
	
}
