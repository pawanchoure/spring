/**
 * Created on Sep 21, 2011
 */
package com.pawan.choure.injection.parameters;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.pawanchoure.helloworld.MessageProvider;

/**
 * @author Clarence
 * 
 */
public class InjectRefXML {

	private MessageProvider message;

	public void setMessage(MessageProvider message) {
		this.message = message;
	}

	public static void main(String[] args) {

		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("classpath:inject-parameters.xml");
		ctx.refresh();

		InjectRefXML injectRef = (InjectRefXML) ctx.getBean("injectRef");
		System.out.println(injectRef);
	}

	public String toString() {
		return message.getMessage();
	}

}
