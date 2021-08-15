/**
 * Created on Sep 23, 2011
 */
package com.pawan.choure.injection.lookupmethod;

/**
 * @author Clarence
 * 
 */
public abstract class AbstractLookupDemoBean implements DemoBean {

	public abstract MyHelper getMyHelper();

	public void someOperation() {
		getMyHelper().doSomethingHelpful();
	}
}
