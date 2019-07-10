package com.pawanchoure.helloworld.setter.injection.annotation;

import org.springframework.stereotype.Service;

import com.pawanchoure.helloworld.MessageProvider;

@Service("messageProvider")
public class SetterInjectionAnnotationHelloWorldMessageProvider implements MessageProvider {

	public String getMessage(){
		return "Hello World!";
	}
}
