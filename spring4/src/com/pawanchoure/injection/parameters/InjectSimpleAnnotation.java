/**
 * Created on Sep 21, 2011
 */
package com.pawanchoure.injection.parameters;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.stereotype.Service;

/**
 * @author Clarence
 *
 */
@Service("injectSimpleParameter")
public class InjectSimpleAnnotation {

	@Value("John Smith")
    private String name;

	@Value("35")
    private int age;

	@Value("1.78")
    private float height;

	@Value("true")
    private boolean programmer;

	@Value("1103760000")
    private Long ageInSeconds;

    public static void main(String[] args) {

    	GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("classpath:inject-parameters-annotation.xml");
		ctx.refresh();    	
    	
        InjectSimpleAnnotation simple = (InjectSimpleAnnotation)ctx.getBean("injectSimpleParameter");
        InjectRefAnnotation simpleRef = (InjectRefAnnotation)ctx.getBean("injectRefParameter");
        System.out.println(simple);
        System.out.println(simpleRef);
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
