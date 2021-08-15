package com.pawan.choure.helloworld.annotation;


import com.pawan.choure.helloworld.common.HelloWorldMessageProvider;
import com.pawan.choure.helloworld.common.MessageProvider;
import com.pawan.choure.helloworld.common.MessageRenderer;
import com.pawan.choure.helloworld.common.StandardOutMessageRenderer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by iuliana.cosmina on 1/28/17.
 */
@Configuration
public class HelloWorldConfiguration {

	@Bean
	public MessageProvider provider() {
		return new HelloWorldMessageProvider();
	}

	@Bean
	public MessageRenderer renderer(){
		MessageRenderer renderer = new StandardOutMessageRenderer();
		renderer.setMessageProvider(provider());
		return renderer;
	}
}
