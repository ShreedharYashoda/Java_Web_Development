package com.shree.ws;

import javax.jws.WebService;

@WebService(endpointInterface = "com.shree.ws.Hello")
public class HelloImpl implements Hello {

	public String sayHello(String name) {
		
		return "Hello "+name;
	}

}
