package com.pawan.choure.helloworld.constructor.injection.confusion.xml;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.pawanchoure.helloworld.MessageProvider;


public class HelloWorldSpringDI {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("classpath:constructor-confusion-app-context.xml");
		ctx.refresh();
		
		MessageProvider mp=ctx.getBean("messageProvider",MessageProvider.class);
        System.out.println(mp);
        ctx.close();
		

	}

}
