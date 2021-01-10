package com.kcx.demo.springDemo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/*
 * 只要该类在spring中有实例，对Spring中其他所有的bean都适用
 */
public class InitHelloWorld implements BeanPostProcessor {

	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException{
		System.out.println(String.format("Before %s bean inits", beanName));
		return bean;
	}
	
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println(String.format("After %s bean inits", beanName));
		return bean;
	}
}
