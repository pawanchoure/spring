package com.pawanchoure.helloworld.annotation;

import org.springframework.stereotype.Service;
import com.pawanchoure.helloworld.MessageProvider;
import com.pawanchoure.helloworld.MessageRenderer;

@Service("messageRenderer")
public class AnnotationHelloWorldMessageRenderer implements MessageRenderer {

	private MessageProvider messageProvider = null;

	public void render() {
		if (messageProvider == null) {
			throw new RuntimeException(
					"You must set the property messageProvider of class :"
							+ AnnotationHelloWorldMessageRenderer.class
									.getName());
		}
		System.out.println(messageProvider.getMessage());
	}

	public void setMessageProvider(MessageProvider provider) {
		this.messageProvider = provider;

	}

	public MessageProvider getMessageProvider() {
		return this.messageProvider;
	}
}
