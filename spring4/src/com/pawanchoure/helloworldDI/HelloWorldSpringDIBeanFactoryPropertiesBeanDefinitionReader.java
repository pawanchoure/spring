package com.pawanchoure.helloworldDI;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.PropertiesBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.FileSystemResource;

import com.pawanchoure.helloworld.MessageRenderer;

public class HelloWorldSpringDIBeanFactoryPropertiesBeanDefinitionReader {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		PropertiesBeanDefinitionReader propReader = new PropertiesBeanDefinitionReader(factory);
		propReader.loadBeanDefinitions(new FileSystemResource("src/msf.properties"));
		//propReader.registerBeanDefinitions(System.getProperties());
		
		//Bean lookup by id
		MessageRenderer mrById=factory.getBean("renderer",MessageRenderer.class);
		mrById.render();
		
		//Bean lookup by name
		MessageRenderer mrByName=factory.getBean("pawan",MessageRenderer.class);
		mrByName.render();

	}

}
