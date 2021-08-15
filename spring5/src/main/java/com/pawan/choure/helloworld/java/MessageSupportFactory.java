package com.pawan.choure.helloworld.java;

import com.pawan.choure.helloworld.common.MessageProvider;
import com.pawan.choure.helloworld.common.MessageRenderer;

import java.util.Properties;

public class MessageSupportFactory {

	private static MessageSupportFactory instance;
	private Properties props;
	private MessageRenderer renderer;
	private MessageProvider provider;

	private MessageSupportFactory() {
		props = new Properties();
		try {
			//props.load(this.getClass().getClassLoader().getResourceAsStream("msf.properties"));
			props.load(this.getClass().getResourceAsStream("/msf.properties"));
			String rendererClass = props.getProperty("renderer.class");
			String providerClass = props.getProperty("provider.class");
			renderer = (MessageRenderer) Class.forName(rendererClass).newInstance();
			provider = (MessageProvider) Class.forName(providerClass).newInstance();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	static {
		instance = new MessageSupportFactory();
	}

	public static MessageSupportFactory getInstance() {
		return instance;
	}

	public MessageRenderer getMessageRenderer() {
		return renderer;
	}

	public MessageProvider getMessageProvider() {
		return provider;
	}
}
