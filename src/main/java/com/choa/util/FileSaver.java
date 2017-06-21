package com.choa.util;

import java.io.File;
import java.util.UUID;

import org.springframework.util.FileCopyUtils;

public class FileSaver {
	
	public String filesave(String realPath, String oriName, byte [] fileData) throws Exception{
		File f = new File(realPath);
		if(!f.exists()){
			f.mkdirs();
		}
		//upload 파일에 저장되는 실제 파일 name
		String fileName = UUID.randomUUID().toString()+"_"+oriName;
		File target = new File(f, fileName);
		FileCopyUtils.copy(fileData, target);
		return fileName;
	}

}
