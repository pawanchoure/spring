package com.pawan.choure.setter.injection.xml;

import com.pawan.choure.helloworld.common.MessageProvider;

public class ConfigurableMessageProvider implements MessageProvider {
    private String message = "Default message";


    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
