package com.bpm.reader;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	AbstractApplicationContext ctx = 
				new ClassPathXmlApplicationContext("applicationContext-camel.xml");
    	ctx.start();
    	System.out.println("Entered>>>>>");
    	ctx.stop();
    }
}
