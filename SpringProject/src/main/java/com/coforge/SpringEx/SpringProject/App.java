package com.coforge.SpringEx.SpringProject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
    	@SuppressWarnings("resource") 
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		HelloSpring helloSpring = ctx.getBean("helloBean", HelloSpring.class); 
		helloSpring.welcomeMessage(); 
    }
}
