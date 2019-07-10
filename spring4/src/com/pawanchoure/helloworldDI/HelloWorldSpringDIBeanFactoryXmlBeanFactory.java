package com.pawanchoure.helloworldDI;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.pawanchoure.helloworld.MessageRenderer;

public class HelloWorldSpringDIBeanFactoryXmlBeanFactory {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		/*
		 * It does not load the xml file from other directory apart from the
		 * source
		 */
		XmlBeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("app-context.xml"));

		MessageRenderer mr = (MessageRenderer) beanFactory.getBean("renderer");
		mr.render();

	}

}
