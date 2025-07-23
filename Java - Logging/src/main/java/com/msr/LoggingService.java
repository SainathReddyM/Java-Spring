package com.msr;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingService {

    /**
     * Get the logger for this specific class.
     *
     */
    private static final Logger logger = LoggerFactory.getLogger(LoggingService.class);

    public void processData(String data){

        //Use parameterized logging to avoid unnecessary string concatenation.
        logger.info("Starting to process data for ID: {}", data);
        try{
            if(data==null){
                throw new IllegalArgumentException("Data cannot be null");
            }
            logger.debug("Data processing successful for ID: {}", data);
        }catch (Exception e){
            logger.error("Failed to process data for ID: {}", data,e);
        }

    }
}
