package com.pawan.choure.helloworld.setter.injection.annotation;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.pawanchoure.helloworld.MessageRenderer;

public class HelloWorldSpringDI {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("classpath:setter-injection-annotation-app-context.xml");
		ctx.refresh();
		MessageRenderer messageRenderer = ctx.getBean("messageRenderer",MessageRenderer.class);
		messageRenderer.render();
		ctx.close();
	}

}
