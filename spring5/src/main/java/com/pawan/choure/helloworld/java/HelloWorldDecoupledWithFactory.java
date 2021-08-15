package com.pawan.choure.helloworld.java;

import com.pawan.choure.helloworld.common.MessageProvider;
import com.pawan.choure.helloworld.common.MessageRenderer;

public class HelloWorldDecoupledWithFactory {

    public static void main(String... args) {
        MessageRenderer mr = MessageSupportFactory.getInstance().getMessageRenderer();
        MessageProvider mp = MessageSupportFactory.getInstance().getMessageProvider();
        mr.setMessageProvider(mp);
        mr.render();
    }
}
