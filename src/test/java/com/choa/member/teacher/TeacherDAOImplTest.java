package com.choa.member.teacher;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.choa.ex5.MyAbstractTestUnit;

public class TeacherDAOImplTest extends MyAbstractTestUnit{
	
	@Autowired
	private TeacherDAOImpl teacherDAOImpl;
	private static TeacherDTO teacherDTO;
	
	@Test
	public void Test() throws Exception{
		int result = teacherDAOImpl.memberJoin(teacherDTO);
		assertEquals(1, result);
	}
	
	public static void makeTeacher(){
		
		teacherDTO = new TeacherDTO();
		teacherDTO.setId("dddd");
		teacherDTO.setPw("5678");
		teacherDTO.setName("dddd");
		teacherDTO.setAge(27);
		teacherDTO.setGrade("t");
		teacherDTO.setFilename("dddd.jpg");
		teacherDTO.setOriname("dddd.jpg");
		teacherDTO.setSubject("math");
		
		
	}

}
