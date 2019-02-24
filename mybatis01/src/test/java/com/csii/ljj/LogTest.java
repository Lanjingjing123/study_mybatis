package com.csii.ljj;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogTest {
    private static final Logger logger = LoggerFactory.getLogger(LogTest.class);

    public static void main(String[] args) {
        logger.info("111");
        logger.debug("222");
//        logger.error("333");
        logger.info("444");
        logger.info("555");
    }
}
