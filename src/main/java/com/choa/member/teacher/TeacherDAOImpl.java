package com.choa.member.teacher;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.choa.member.MemberDAO;
import com.choa.member.MemberDTO;

@Repository
public class TeacherDAOImpl implements MemberDAO{
	
	@Autowired
	private SqlSession sqlsession;
	private final String NAMESPACE = "TeacherMapper.";
	private final String NAMESPACE2 ="MemberMapper.";
	
	@Override
	public int memberJoin(MemberDTO memberDTO) throws Exception {
		sqlsession.insert(NAMESPACE2+"joinMember", memberDTO);
		int result = sqlsession.insert(NAMESPACE+"joinTeacher", memberDTO);
		return result;
	}

	@Override
	public MemberDTO memberLogin(MemberDTO memberDTO) throws Exception {
		return sqlsession.selectOne(NAMESPACE2+"loginMember", memberDTO);
		
	}
	
	
	@Override
	public MemberDTO memberPage(String id) throws Exception {
		
		return sqlsession.selectOne(NAMESPACE+"memberPage", id);
	}
	
	public MemberDTO test(MemberDTO memberDTO){
		return sqlsession.selectOne(NAMESPACE+"memberLogin", memberDTO);
		
	}
		
}
