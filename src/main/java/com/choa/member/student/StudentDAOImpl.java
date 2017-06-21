package com.choa.member.student;

import java.sql.Connection;

import javax.xml.stream.events.Namespace;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.choa.member.MemberDAO;
import com.choa.member.MemberDTO;

@Repository
public class StudentDAOImpl implements MemberDAO{
	
	@Autowired
	private SqlSession sqlSession;
	private final String NAMESPACE = "StudentMapper.";
	private final String NAMESPACE2 = "MemberMapper.";

	@Override
	public int memberJoin(MemberDTO memberDTO) throws Exception {
		sqlSession.insert(NAMESPACE2+"joinMember", memberDTO);
	int result = sqlSession.insert(NAMESPACE+"joinStudent", memberDTO);
		
		return result;
	}
	

	
	
}
