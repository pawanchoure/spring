package com.pawan.choure.helloworldDI;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.FileSystemResource;

import com.pawanchoure.helloworld.MessageRenderer;

public class HelloWorldSpringDIBeanFactoryDefaultListableBeanFactory {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader rdr = new XmlBeanDefinitionReader(factory);
		rdr.loadBeanDefinitions(new FileSystemResource("resources/helloworld-di/app-context.xml"));
		
		//Bean lookup by id
		MessageRenderer mrById=factory.getBean("renderer",MessageRenderer.class);
		mrById.render();
		
		//Bean lookup by name
		MessageRenderer mrByName=factory.getBean("renderername",MessageRenderer.class);
		mrByName.render();

	}

}
