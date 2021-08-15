package com.pawan.choure.bean.naming;

import org.springframework.context.support.GenericXmlApplicationContext;

public class BeanNameExample {

    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:spring/bean-naming/bean-naming.xml");
        ctx.refresh();
        String stringById = ctx.getBean("string1", String.class);
        String stringByName = ctx.getBean("string2", String.class);
        String stringByClass = ctx.getBean("java.lang.String", String.class);
        String stringByProto = ctx.getBean("stringproto", String.class);
        System.out.println(stringById.equalsIgnoreCase(stringByName));
        System.out.println(stringById.equalsIgnoreCase(stringByClass));
        System.out.println(stringById.equalsIgnoreCase(stringByProto));

    }

}
