package com.kcx.demo.springDemo;

public class SpringDemo {

	private String message;
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	public void say(String message) {
		System.out.println("your message:"+ message);
	}
}
