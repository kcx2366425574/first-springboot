package com.kcx.demo.springDemo;

public class AnotherSpringDemo {

	private String message;
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	public void getMessage() {
		System.out.println("your message:"+ message);
	}
	
	public void init() {
		System.out.println("AnotherspringDemo inits now ");
	}
	
	public void destroy() {
		System.out.println("AnotherspringDemo destroys now ");
	}

}
