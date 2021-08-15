package com.pawan.choure.helloworldDIwithoutspring;

import com.pawanchoure.helloworld.HelloWorldMessageProvider;
import com.pawanchoure.helloworld.HelloWorldMessageRenderer;
import com.pawanchoure.helloworld.MessageProvider;
import com.pawanchoure.helloworld.MessageRenderer;

public class HelloWorldDecoupled {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MessageRenderer mr=new HelloWorldMessageRenderer();
		MessageProvider mp=new HelloWorldMessageProvider();
		mr.setMessageProvider(mp);
		mr.render();

	}

}
