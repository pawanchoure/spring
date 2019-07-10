/**
 * Created on Sep 11, 2011
 */
package com.pawanchoure.helloworld;

import java.io.FileInputStream;
import java.util.Properties;

import com.pawanchoure.helloworld.MessageProvider;
import com.pawanchoure.helloworld.MessageRenderer;

/**
 * @author Clarence
 *
 */
public class MessageSupportFactory {

    private static MessageSupportFactory instance = null;

    private Properties props = null;

    private MessageRenderer renderer = null;

    private MessageProvider provider = null;

    private MessageSupportFactory() {
        props = new Properties();

        try {
            props.load(new FileInputStream("src/msf.properties"));

            // get the implementation classes
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
