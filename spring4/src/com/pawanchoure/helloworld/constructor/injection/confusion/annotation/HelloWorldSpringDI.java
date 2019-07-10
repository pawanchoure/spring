package com.pawanchoure.helloworld.constructor.injection.confusion.annotation;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.pawanchoure.helloworld.MessageProvider;


public class HelloWorldSpringDI {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

    	GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("classpath:constructor-confusion-annotation-app-context.xml");
		ctx.refresh();
		
		MessageProvider mp=ctx.getBean("messageProvider",MessageProvider.class);
        System.out.println(mp);
		

	}

}
