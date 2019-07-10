package com.pawanchoure.helloworld.constructor.injection.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pawanchoure.helloworld.MessageRenderer;


public class HelloWorldSpringDI {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		//Initialize Spring ApplicationContext
		ApplicationContext ctx=new ClassPathXmlApplicationContext("constructor-injection-app-context.xml");
		
		MessageRenderer mr=ctx.getBean("renderer",MessageRenderer.class);
		mr.render();

	}

}
