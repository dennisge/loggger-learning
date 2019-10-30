package com.lankio.learning;

import com.lankio.learning.impl.BizServiceImpl;

/**
 * Description: TODO
 * Date: 2019/10/29 14:37
 *
 * @author: dennis
 **/
public class LoggerMain {

    public static void main(String[] args) throws Exception {

        BizService bizService = new BizServiceImpl();

        while (true) {

            bizService.doSomething();

            Thread.sleep(2000);
        }

    }
}
