package com.pawanchoure.helloworld.constructor.injection.confusion.xml;

import com.pawanchoure.helloworld.MessageProvider;


public class ConfigurableConfusionMessageProviderXML  implements MessageProvider{
	private String message;
	
    public ConfigurableConfusionMessageProviderXML(String message) {
        System.out.println("ConstructorConfusion(String) called");
        this.message = message;
    }

    public ConfigurableConfusionMessageProviderXML(int message) {
        System.out.println("ConstructorConfusion(int) called");
        this.message = "Number: " + Integer.toString(message);
    }
	
	public String getMessage() {
	return message;
	}
	
    public String toString() {
        return message;
    }

}
