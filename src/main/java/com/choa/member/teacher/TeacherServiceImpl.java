package com.choa.member.teacher;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.choa.member.MemberDTO;
import com.choa.member.MemberService;
import com.choa.util.FileSaver;

@Service
public class TeacherServiceImpl implements MemberService{
	
	@Autowired
	private TeacherDAOImpl teacherDAOImpl;
	
	
	public int memberJoin(MemberDTO memberDTO, HttpSession session) throws Exception{
		FileSaver fileSaver = new FileSaver();
		
		memberDTO.setOriname(memberDTO.getF1().getOriginalFilename());
		memberDTO.setFilename(fileSaver.filesave(session.getServletContext().getRealPath("resources/upload"), memberDTO.getF1()));
		return teacherDAOImpl.memberJoin(memberDTO);
		
	};

	@Override
	public MemberDTO memberLogin(MemberDTO memberDTO) throws Exception {
		
		return teacherDAOImpl.test(memberDTO);
	}
	
	
	@Override
	public MemberDTO memberPage(MemberDTO memberDTO) throws Exception {
	
		return teacherDAOImpl.memberPage(memberDTO.getId());
	}
	
}
