package com.choa.ex5;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.request;

import java.io.File;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.choa.util.FileSaver;

@Controller
public class FileUploadController {

	@RequestMapping("/test/fileUpForm")
	public void fileUp(){
		System.out.println("formmmmmmmmmmmmmmmmmmm");
	}
	
	
	//@RequestMapping(value="/test/fileUp1", method=RequestMethod.POST)
	//MultipartHttpServletrequest 이용
	public void fileUpload1(String name, MultipartHttpServletRequest request) throws Exception{
		System.out.println("NAME : "+name);
		MultipartFile f = request.getFile("f1");
		//객체(파일)에 저장..
		System.out.println("getName = "+f.getName());
		System.out.println("oriname = "+f.getOriginalFilename());
		System.out.println("getSize = "+f.getSize());
		String path =request.getSession().getServletContext().getRealPath("resources/upload");
		//this.upload1(f, path);
		FileSaver fs = new FileSaver();
		fs.filesave(path, f.getOriginalFilename(), f.getBytes());
	}
	
	
	//@RequestMapping(value="test/fileUp1", method=RequestMethod.POST)
	//string 으로 매핑
	public void fileUpload2(String name, MultipartFile f1, HttpSession session)throws Exception{
		
		System.out.println("getName = "+f1.getName());
		System.out.println("oriname = "+f1.getOriginalFilename());
		System.out.println("getSize = "+f1.getSize());
		String path = session.getServletContext().getRealPath("resources/upload");
		FileSaver fs = new FileSaver();
		fs.filesave(path, f1.getOriginalFilename(), f1.getBytes());
		
	}
	
	//DTO로 받기 : FileDTO 만들고나서 다시 올 것
	@RequestMapping(value="/test/fileUp1", method=RequestMethod.POST)
	public void fileUpload3(FileDTO fileDTO, HttpSession session)throws Exception{
		FileSaver fs = new FileSaver();
		String realPath = session.getServletContext().getRealPath("resources/upload");
		fs.filesave(realPath, fileDTO.getF1());
		
		
		//System.out.println(realPath);
		/*String oriName = fileDTO.getF1().getOriginalFilename();
		byte [] fileData = fileDTO.getF1().getBytes();
		fs.filesave(realPath, oriName, fileData);*/
		
	}
	
	
	
/*	//파일을 디스크에 저장하는 역할 -> util 패키지에 filesaver로 이동
	private String upload1(MultipartFile f, String path) throws Exception{
		System.out.println(path);
		String fileName = UUID.randomUUID().toString();
		System.out.println(fileName);
		fileName = fileName+"_"+f.getOriginalFilename();
		File file = new File(path, fileName);
		
		FileCopyUtils.copy(f.getBytes(), file);
		
		return fileName;
	}*/
	
}
