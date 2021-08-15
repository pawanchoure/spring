package com.pawan.choure.bean.scope.singleton;


import com.pawan.choure.helloworld.common.MessageProvider;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component("provider")
@Scope("prototype")
public class HelloWorldMessageProvider implements MessageProvider {

	@Override
	public String getMessage() {
		return "Hello World!";
	}
}
