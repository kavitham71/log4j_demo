package com.test;

//import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App 
{   //final static Logger logger = Logger.getLogger(App.class);
    private static final Logger logger1 = LoggerFactory.getLogger(App.class);

    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
       
        DOMConfigurator.configure("log4j.xml");	//for log4j.xml
		//logger.setLevel(Level.ERROR);
		logger1.debug("This is a Debug message");
		logger1.info("this is INFO message");
		logger1.warn("This is a Warn Message");
		logger1.error("This is a ERROR message");
		//logger1.fatal("This is a FATAL Message");
		logger1.info("             ");
    }
}
