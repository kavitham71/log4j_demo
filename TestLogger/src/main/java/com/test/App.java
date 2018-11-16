package com.test;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;



/**
 * Hello world!
 *
 */
public class App 
{   final static Logger logger = Logger.getLogger(App.class);
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        DOMConfigurator.configure("log4j.xml");	//for log4j.xml
		//logger.setLevel(Level.ERROR);
		logger.debug("This is a Debug message");
		logger.info("this is INFO message");
		logger.warn("This is a Warn Message");
		logger.error("This is a ERROR message");
		logger.fatal("This is a FATAL Message");
		logger.info("             ");
    }
}
