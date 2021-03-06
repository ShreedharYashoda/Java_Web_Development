package com.shree;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	private AtomicLong counter = new AtomicLong();
	
	@GetMapping("/hello")
	public HelloObject getHelloWorldObject() {
		HelloObject hello = new HelloObject();
		hello.setMsg("Hi hello bye bye");
		return hello;
	}

}
