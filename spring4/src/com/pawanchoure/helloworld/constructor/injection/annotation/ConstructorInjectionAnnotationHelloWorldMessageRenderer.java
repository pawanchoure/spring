package com.pawanchoure.helloworld.constructor.injection.annotation;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pawanchoure.helloworld.MessageProvider;
import com.pawanchoure.helloworld.MessageRenderer;

@Service("messageRenderer")
public class ConstructorInjectionAnnotationHelloWorldMessageRenderer implements MessageRenderer{

	private MessageProvider messageProvider=null;
	public void render(){
		if(messageProvider==null)
		{
			throw new RuntimeException("You must set the property messageProvider of class :"+
					ConstructorInjectionAnnotationHelloWorldMessageRenderer.class.getName());
		}
		System.out.println(messageProvider.getMessage());
	}
	
	
/*	@Autowired
	public void setMessageProvider(MessageProvider provider){
		this.messageProvider=provider;
	}*/
	
	@Resource(name="messageProvider")
	public void setMessageProvider(MessageProvider provider){
		this.messageProvider=provider;
	}
	
	
	public MessageProvider getMessageProvider(){
		return this.messageProvider;
	}
	
}
