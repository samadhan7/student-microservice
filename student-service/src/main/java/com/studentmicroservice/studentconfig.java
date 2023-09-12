package com.studentmicroservice;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class studentconfig {
	
	@Bean
	public ModelMapper modelmapper() {
		return new ModelMapper();
	}

}
