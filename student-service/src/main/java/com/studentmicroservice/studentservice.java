package com.studentmicroservice;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class studentservice  {
	@Autowired
	private studentRepo studentrepo;
	
	@Autowired
	private ModelMapper modelmapper;
	
	public studentResponse getstudentbyid(int id) {
		
		student std=studentrepo.findById(id).get();
		
//		this is manual way for less data
//		studentResponse sr=new studentResponse();
//		sr.setId(std.getId());
//		sr.setName(std.getName());
//		sr.setBloodgroup(std.getBloodgroup());
		
//		this is for multiple columns or large data
		studentResponse sr=modelmapper.map(std, studentResponse.class );

		return sr;
	}
	
	
	

}
