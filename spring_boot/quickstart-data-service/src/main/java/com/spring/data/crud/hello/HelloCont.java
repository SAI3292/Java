package com.spring.data.crud.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloCont {

	@RequestMapping("/hello")
	public String print() {
		return "hello world";
	}
}
