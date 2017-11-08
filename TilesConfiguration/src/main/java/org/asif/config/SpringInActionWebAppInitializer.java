package org.asif.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/*
 * 
 * Configuring DispatcherServlet via AbstractAnnotationConfigDispatcherServletInitializer is an alternative to the traditional
 * web.xml file.
 * 
 */
public class SpringInActionWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class<?>[]{RootConfig.class};
	}

	
	//Specify configuration class
	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class<?>[]{WebConfig.class};
	}

	//Map DispatcherServlet to /
	@Override
	protected String[] getServletMappings() {
		return new String[]{"/"};
	}

}
