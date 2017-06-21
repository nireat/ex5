package com.choa.member.student;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.choa.ex5.MyAbstractTestUnit;

public class StudentDAOImplTest extends MyAbstractTestUnit{
	
	@Autowired
	private StudentDAOImpl studentDAOImpl;
	@Autowired
	private StudentServiceImpl studentServiceImpl;
	private static StudentDTO studentDTO;

	@Test
	public void Test() throws Exception{
		int result = studentServiceImpl.memberJoin(studentDTO);
		assertEquals(1, result);
	}
	
	@BeforeClass
	public static void makeStudent(){
		
		studentDTO = new StudentDTO();
		studentDTO.setId("universe3");
		studentDTO.setPw("1234");
		studentDTO.setName("lala");
		studentDTO.setAge(10);
		studentDTO.setGrade("s");
		studentDTO.setFilename("ll.jpg");
		studentDTO.setOriname("ll.jpg");
		studentDTO.setSid("universe3");
		studentDTO.setPhone("01012345678");
		studentDTO.setTid("hani");
		
	}
	
}
