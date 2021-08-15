/**
 * Created on Sep 21, 2011
 */
package com.pawan.choure.injection.parameters;

import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * @author Clarence
 *
 */
public class InjectSimpleXML {

    private String name;

    private int age;

    private float height;

    private boolean programmer;

    private Long ageInSeconds;

    public static void main(String[] args) {

    	GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("classpath:inject-parameters.xml");
		ctx.refresh();    	
    	
        InjectSimpleXML simple = (InjectSimpleXML)ctx.getBean("injectSimple");
        InjectRefXML simpleXML=(InjectRefXML)ctx.getBean("injectRef");
        System.out.println(simple);
        System.out.println(simpleXML);
    }

    public void setAgeInSeconds(Long ageInSeconds) {
        this.ageInSeconds = ageInSeconds;
    }

    public void setProgrammer(boolean programmer) {
        this.programmer = programmer;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return    "Name :" + name + "\n"
                + "Age:" + age + "\n"
                + "Age in Seconds: " + ageInSeconds + "\n"
                + "Height: " + height + "\n"
                + "Is Programmer?: " + programmer;
    }	
	
}
