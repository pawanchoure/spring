package com.pawan.choure.injection.collection.annotation;

import org.springframework.stereotype.Service;

import com.pawanchoure.helloworld.MessageProvider;

@Service("messageProvider")
public class AnnotationHelloWorldMessageProvider implements MessageProvider {

	public String getMessage(){
		return "Hello World!";
	}
}
