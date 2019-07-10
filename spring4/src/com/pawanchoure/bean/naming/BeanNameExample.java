package com.pawanchoure.bean.naming;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.pawanchoure.helloworld.MessageProvider;

public class BeanNameExample {

	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("classpath:bean-naming.xml");
		ctx.refresh();
		String stringById = ctx.getBean("string1",String.class);
		String stringByName = ctx.getBean("string2",String.class);
		String stringByClass = ctx.getBean("java.lang.String",String.class);
		System.out.println(stringById.toString());
		System.out.println(stringByName.toString());
		System.out.println(stringByClass.toString());

	}

}
