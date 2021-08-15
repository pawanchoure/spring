/**
 * Created on Sep 21, 2011
 */
package com.pawan.choure.injection.beans;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.pawanchoure.helloworld.MessageProvider;

/**
 * @author Clarence
 * 
 */
public class InjectRefBeanXML {

	private MessageProvider message;

	public void setMessage(MessageProvider message) {
		this.message = message;
	}

	public static void main(String[] args) {

		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("classpath:inject-beans.xml");
		ctx.refresh();

		InjectRefBeanXML injectRef = (InjectRefBeanXML) ctx.getBean("injectRef");
		System.out.println(injectRef);
		ctx.close();
	}

	public String toString() {
		return message.getMessage();
	}

}
