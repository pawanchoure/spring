/**
 * Created on Sep 21, 2011
 */
package com.pawan.choure.injection.parameters;

import org.springframework.stereotype.Service;

import com.pawanchoure.helloworld.MessageProvider;

/**
 * @author Clarence
 * 
 */
@Service("injectRefParameter")
public class InjectRefAnnotation {

	private MessageProvider message;

	public void setMessage(MessageProvider message) {
		this.message = message;
		System.out.println(message.getMessage());
	}
	

}
