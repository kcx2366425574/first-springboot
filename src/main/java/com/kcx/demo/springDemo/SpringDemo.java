package com.kcx.demo.springDemo;

public class SpringDemo {

	private String message;
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	public void getMessage() {
		System.out.println("your message:"+ message);
	}
	
	public void init() {
		System.out.println("springDemo inits now ");
	}
	
	public void destroy() {
		System.out.println("springDemo destroys now ");
	}

}
