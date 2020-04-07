package com.siri.lc.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class LoveCalApplIntializer //implements WebApplicationInitializer 
{
/*
	public void onStartup(ServletContext servletContext) throws ServletException {
		
		//web container 
		AnnotationConfigWebApplicationContext webApplicationContext=new AnnotationConfigWebApplicationContext();
		//webApplicationContext.register(LoveCalculatorAppConfig.class);
		//create an object for dispatcher servlet
		DispatcherServlet ds=new DispatcherServlet(webApplicationContext);
	//register the DispatcherServlet with servlet context
		ServletRegistration.Dynamic servletReg=servletContext.addServlet("myDispatcherServlet", ds);
		servletReg.addMapping("/mywebsite.com/*");
		servletReg.setLoadOnStartup(1);
	

}*/
}
