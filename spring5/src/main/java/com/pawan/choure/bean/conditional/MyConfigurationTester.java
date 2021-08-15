package com.pawan.choure.bean.conditional;

import java.util.Properties;

import javax.annotation.Resource;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.pawanchoure.helloworld.MessageProvider;

public class MyConfigurationTester {
	
	@Resource(name="props")
	private Properties props;

	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("classpath:conditional -bean-annotation.xml");
		ctx.refresh();
		MessageProvider messageProvider = ctx.getBean("messageProvider",MessageProvider.class);
		System.out.println(messageProvider.getMessage());
		
		ctx.close();

	}

}
