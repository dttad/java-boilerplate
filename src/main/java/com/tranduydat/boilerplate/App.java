package com.tranduydat.boilerplate;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.function.Function;

/**
 * Java Boilerplate project
 * @version 1.0 2023-01-12
 * @author trdat
 */
public class App 
{
    private static final Logger logger = LogManager.getLogger(App.class);
    public static void main( String[] args )
    {
        logger.error("Run!");
        logger.fatal("Failed");
        System.out.println( "Hello World!" );
    }
}
