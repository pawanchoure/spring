package com.pawan.choure.helloworld.constructor.injection.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.pawanchoure.helloworld.MessageProvider;

@Service("messageProvider")
public class ConfigurableMessageProvider  implements MessageProvider{
	private String message;
	
	@Autowired
	public ConfigurableMessageProvider(@Value("This is a configurable message via Construction Injection using Annotation") String message) {
			this.message = message;
	}	
	public String getMessage() {
	return message;
	}
	
	

}
