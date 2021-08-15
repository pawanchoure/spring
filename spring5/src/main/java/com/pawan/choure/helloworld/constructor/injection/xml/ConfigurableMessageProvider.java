package com.pawan.choure.helloworld.constructor.injection.xml;

import com.pawanchoure.helloworld.MessageProvider;

public class ConfigurableMessageProvider  implements MessageProvider{
	private String message;
	public ConfigurableMessageProvider(String message) {
	this.message = message;
	}
	public String getMessage() {
	return message;
	}

}
