package com.shree.ws;

import javax.xml.ws.Endpoint;

public class HelloPubliser {

	public static void main(String[] args) {
		Endpoint point = Endpoint.publish("http://localhost:81/ws/hello", new HelloImpl());
		System.out.println("Webservice successfully published: "+point.isPublished());

	}

}
