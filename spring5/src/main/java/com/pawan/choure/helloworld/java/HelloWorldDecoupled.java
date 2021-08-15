package com.pawan.choure.helloworld.java;

import com.pawan.choure.helloworld.common.HelloWorldMessageProvider;
import com.pawan.choure.helloworld.common.MessageProvider;
import com.pawan.choure.helloworld.common.MessageRenderer;
import com.pawan.choure.helloworld.common.StandardOutMessageRenderer;

public class HelloWorldDecoupled {
    public static void main(String... args) {
        MessageRenderer mr = new StandardOutMessageRenderer();
        MessageProvider mp = new HelloWorldMessageProvider();
        mr.setMessageProvider(mp);
        mr.render();
    }
}
