package com.pawan.choure.helloworld.annotation;


import com.pawan.choure.helloworld.common.MessageRenderer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by iuliana.cosmina on 1/28/17.
 */
public class HelloWorldSpringAnnotated {

	public static void main(String... args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext
				(HelloWorldConfiguration.class);
		MessageRenderer mr = ctx.getBean("renderer", MessageRenderer.class);
		mr.render();
	}
}
