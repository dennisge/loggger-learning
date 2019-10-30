package com.lankio.learning.impl;

import com.lankio.learning.BizService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Random;

/**
 * Description: Logger Test
 * Date: 2019/10/29 14:31
 *
 * @author: dennis
 **/
public class BizServiceImpl implements BizService {

    private Logger logger = LoggerFactory.getLogger(BizServiceImpl.class);


    @Override
    public void doSomething() {

        logger.debug("DEBUG-INFO: {}","Value-DEBUG");



       try {
           if (new Random().nextInt(10000) % 2 == 0) {
               throw new RuntimeException("I'm Exception!");
           }
       } catch (RuntimeException ex) {
           logger.error("ERROR OCCURRED: {}", "Value-ERROR", ex);
       }
    }
}
