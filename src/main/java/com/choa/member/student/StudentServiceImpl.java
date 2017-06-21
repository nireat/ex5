package com.choa.member.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.choa.member.MemberDTO;
import com.choa.member.MemberService;

@Service
public class StudentServiceImpl implements MemberService{
	
	@Autowired
	private StudentDAOImpl studentDAOImpl;

	@Override
	public int memberJoin(MemberDTO memberDTO) throws Exception {
		
		return studentDAOImpl.memberJoin(memberDTO);
	}
	
	
	
}
