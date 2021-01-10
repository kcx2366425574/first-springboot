package com.kcx.demo;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kcx.demo.springDemo.AnotherSpringDemo;
import com.kcx.demo.springDemo.SpringDemo;

/**
 * 
 * @author kuangcx
 * @description     postProcessBeforeInitialization -> init -> postProcessAfterInitialization -> {your own methods} -> destroy
 */
public class DemoApplication {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("config/bean.xml");
//		ApplicationContext context = new FileSystemXmlApplicationContext(
//				"file:///home/kuangcx/Documents/workspace-spring-tool-suite-4-4.8.1.RELEASE/first-springboot/src/main/resources/config/bean.xml");
		SpringDemo demo = (SpringDemo) context.getBean("springDemo");
		demo.getMessage();
		
		
		AnotherSpringDemo demo2 = (AnotherSpringDemo)context.getBean("anotherSpringDemo");
		demo2.getMessage();
		
		context.registerShutdownHook();
	}

}
