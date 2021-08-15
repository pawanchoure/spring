package com.pawan.choure.helloworld.constructor.injection.confusion.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.pawanchoure.helloworld.MessageProvider;

@Service("messageProvider")
public class ConfigurableConfusionMessageProvider  implements MessageProvider{
	private String message;
	
    public ConfigurableConfusionMessageProvider(String message) {
        System.out.println("ConstructorConfusion(String) called");
        this.message = message;
    }

    @Autowired
    public ConfigurableConfusionMessageProvider(@Value("90") int message) {
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
