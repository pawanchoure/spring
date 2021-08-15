package com.pawan.choure.bean.scope.singleton;

import com.pawan.choure.helloworld.common.MessageProvider;
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
		MessageRenderer mr1 = ctx.getBean("renderer", MessageRenderer.class);
		MessageRenderer mr2 = ctx.getBean("renderer", MessageRenderer.class);
		MessageProvider mp1=ctx.getBean("provider", MessageProvider.class);
		MessageProvider mp2=ctx.getBean("provider", MessageProvider.class);
		System.out.println(mr1==mr2);
		System.out.println(mp1==mp2);
		System.out.println(mr1.getMessageProvider()==mr2.getMessageProvider());

	}
}
