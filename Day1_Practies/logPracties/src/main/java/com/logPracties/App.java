package com.logPracties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
	private static final Logger LOG = LogManager.getLogger(App.class);
    public static void main( String[] args )
    {
		String message = "Hello World!";
		LOG.debug(message + "will be printed on Debug");
		LOG.info(message + "will be printed on info");
		LOG.warn(message + "will be printed on warn");
		LOG.error(message + "will be printed on Debug");
		LOG.fatal(message + "will be printed on Debug");
		LOG.info( "Appache String {}." , message);
        System.out.println(message);
    }
}
