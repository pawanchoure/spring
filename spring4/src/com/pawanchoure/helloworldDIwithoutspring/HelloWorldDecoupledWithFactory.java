package com.pawanchoure.helloworldDIwithoutspring;

import com.pawanchoure.helloworld.MessageProvider;
import com.pawanchoure.helloworld.MessageRenderer;
import com.pawanchoure.helloworld.MessageSupportFactory;

public class HelloWorldDecoupledWithFactory {
	
	public static void main(String[] args) {
		MessageRenderer mr=MessageSupportFactory.getInstance().getMessageRenderer();
		MessageProvider mp=MessageSupportFactory.getInstance().getMessageProvider();
		mr.setMessageProvider(mp);
		mr.render();

	}


}
