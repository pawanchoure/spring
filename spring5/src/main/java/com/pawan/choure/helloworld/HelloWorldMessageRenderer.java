package com.pawan.choure.helloworld;

public class HelloWorldMessageRenderer implements MessageRenderer{

	private MessageProvider messageProvider=null;
	public void render(){
		if(messageProvider==null)
		{
			throw new RuntimeException("You must set the property messageProvider of class :"+
					HelloWorldMessageRenderer.class.getName());
		}
		System.out.println(messageProvider.getMessage());
	}
	public void setMessageProvider(MessageProvider provider){
		this.messageProvider=provider;
		
	}
	
	public MessageProvider getMessageProvider(){
		return this.messageProvider;
	}
}
