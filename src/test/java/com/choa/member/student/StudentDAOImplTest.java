package com.choa.member.student;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import javax.servlet.http.HttpSession;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.choa.ex5.MyAbstractTestUnit;
import com.choa.member.MemberDTO;

public class StudentDAOImplTest extends MyAbstractTestUnit{
	
	@Autowired
	private StudentDAOImpl studentDAOImpl;
	@Autowired
	private StudentServiceImpl studentServiceImpl;
	private static StudentDTO studentDTO;
	private static HttpSession session;

	@Test
	public void Test() throws Exception{
	/*	int result = studentServiceImpl.memberJoin(studentDTO, session);
		assertEquals(1, result);*/
		StudentDTO memberDTO = (StudentDTO)studentDAOImpl.test(studentDTO);
		System.out.println(memberDTO.getAge());
		System.out.println(memberDTO.getName());
		System.out.println(memberDTO.getPhone());
	}
	
	@BeforeClass
	public static void makeStudent(){
		String data = "choa";
		studentDTO = new StudentDTO();
		studentDTO.setId(data);
		studentDTO.setPw("1234");
		studentDTO.setName(data);
		studentDTO.setAge(11);
		studentDTO.setGrade("student");
		studentDTO.setFilename(data);
		studentDTO.setOriname(data);
		studentDTO.setPhone(data);
		studentDTO.setTid(data);
		
	}
	
	
	
}
