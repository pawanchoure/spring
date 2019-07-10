package com.pawanchoure.helloworld.annotation;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.pawanchoure.helloworld.MessageProvider;

public class HelloWorldSpringDI {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("classpath:annotation-app-context.xml");
		ctx.refresh();
		MessageProvider messageProvider = ctx.getBean("messageProvider",MessageProvider.class);
		System.out.println(messageProvider.getMessage());
		
		ctx.close();

	}

}
