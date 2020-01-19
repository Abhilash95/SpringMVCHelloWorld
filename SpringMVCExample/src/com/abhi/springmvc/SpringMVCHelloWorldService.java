package com.abhi.springmvc;

import org.springframework.stereotype.Service;

@Service
public class SpringMVCHelloWorldService {

	public String printHello() {
		
		return "Hello From Service !!";
	}
	
}
