package com.choudhury.boilerplate.log4j2;

import lombok.extern.log4j.Log4j2;


@Log4j2
public class LombokLog4J2 {

    public void doSomeAddAndLog(){
        int result = 2 * 2;
        log.info("result of calculation = {}",result);
    }
}
