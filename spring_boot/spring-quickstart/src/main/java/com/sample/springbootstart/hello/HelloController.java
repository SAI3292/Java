package com.sample.springbootstart.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//any class to make it as rest controller
//method execute on hit of URL
public class HelloController {

	@RequestMapping("/hello")
	//By default Get otherwise specify it
	public String SayHi(){
		return "Hello";
	}
}
