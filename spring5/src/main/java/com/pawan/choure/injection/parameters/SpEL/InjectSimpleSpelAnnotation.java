/**
 * Created on Sep 21, 2011
 */
package com.pawan.choure.injection.parameters.SpEL;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.stereotype.Service;

/**
 * @author Clarence
 *
 */
@Service("injectSimpleSpelAnnotation")
public class InjectSimpleSpelAnnotation {

	@Value("#{injectSimpleConfig.name}")
    private String name;

	@Value("#{injectSimpleConfig.age}")
    private int age;

	@Value("#{injectSimpleConfig.height}")
    private float height;

	@Value("#{injectSimpleConfig.programmer}")
	private boolean programmer;

	@Value("#{injectSimpleConfig.ageInSeconds}")
    private Long ageInSeconds;

    public static void main(String[] args) {

    	GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("classpath:inject-parameters-spel-annotation.xml");
		ctx.refresh();    	
    	
        InjectSimpleSpelAnnotation simple = (InjectSimpleSpelAnnotation)ctx.getBean("injectSimpleSpelAnnotation");
        System.out.println(simple);
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
