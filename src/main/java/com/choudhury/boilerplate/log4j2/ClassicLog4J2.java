package com.choudhury.boilerplate.log4j2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ClassicLog4J2 {

    private static final Logger log = LogManager.getLogger(ClassicLog4J2.class);

    public void doSomeAddAndLog(){
        int result = 2 * 2;
        log.info("result of calculation = {}",result);
    }

}
