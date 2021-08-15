package com.pawan.choure.contruction.injection.xml;

import com.pawan.choure.helloworld.common.MessageProvider;
import com.pawan.choure.helloworld.common.MessageRenderer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class ConstructorInjection {

    /**
     * @param args
     */
    public static void main(String[] args) {

        //Initialize Spring ApplicationContext
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring/constructor-injection/constructor-injection-app-context.xml");

        MessageProvider mr = ctx.getBean("provider", MessageProvider.class);
        System.out.println(mr.getMessage());

    }

}
