package com.pawanchoure.helloworld.constructor.injection.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pawanchoure.helloworld.MessageRenderer;


public class HelloWorldSpringDI {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		//Initialise Spring ApplicationContext
		ApplicationContext ctx=new ClassPathXmlApplicationContext("constructor-injection-annotation-app-context.xml");
		
		MessageRenderer mr=ctx.getBean("messageRenderer",MessageRenderer.class);
		mr.render();
		

	}

}
