package com.pawan.choure.helloworldDI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pawanchoure.helloworld.MessageRenderer;


public class HelloWorldSpringDIApplicationContext {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		//Initialise Spring ApplicationContext
		ApplicationContext ctx=new ClassPathXmlApplicationContext("app-context.xml");
		
		MessageRenderer mr=ctx.getBean("renderer",MessageRenderer.class);
		mr.render();

	}

}
