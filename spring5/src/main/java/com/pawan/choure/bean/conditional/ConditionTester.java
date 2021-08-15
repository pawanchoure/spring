package com.pawan.choure.bean.conditional;

import java.awt.Window;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.pawanchoure.helloworld.MessageProvider;

public class ConditionTester {

	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("classpath:conditional -bean-annotation.xml");
		ctx.refresh();
		MessageProvider messageProvider = ctx.getBean("messageProvider",MessageProvider.class);
		System.out.println(messageProvider.getMessage());
		
		ctx.close();

	}
	
	@Bean
	@Conditional(LinuxCondition.class)
	public Conditional myCondition(){
		return null;
		
	}
	
	@Bean
	@Conditional(WindowsCondition.class)
	public Conditional myCondition2(){
		return null;
		
	}

}
