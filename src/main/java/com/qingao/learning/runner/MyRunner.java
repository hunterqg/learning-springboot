package com.qingao.learning.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author qingao
 * @date 2019/6/28 15:31
 **/
@Component
@Order(1)
public class MyRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("After Application started ......");
    }
}
