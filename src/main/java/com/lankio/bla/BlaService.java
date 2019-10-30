package com.lankio.bla;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Description: TODO
 * Date: 2019/10/30 20:24
 *
 * @author: dennis
 **/
public class BlaService {

    private Logger logger = LoggerFactory.getLogger(BlaService.class);

    public void bla() {

        logger.debug("bla : {}", 1);

        logger.info("bla : {}", 2);

    }
}
