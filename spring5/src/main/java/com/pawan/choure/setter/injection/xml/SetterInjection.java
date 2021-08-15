package com.pawan.choure.setter.injection.xml;

import com.pawan.choure.helloworld.common.MessageProvider;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SetterInjection {

    /**
     * @param args
     */
    public static void main(String[] args) {

        //Initialize Spring ApplicationContext
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring/setter-injection/setter-injection-app-context.xml");

        MessageProvider mr = ctx.getBean("provider", MessageProvider.class);
        System.out.println(mr.getMessage());

    }

}
