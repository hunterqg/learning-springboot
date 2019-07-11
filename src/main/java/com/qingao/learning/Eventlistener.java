package com.qingao.learning;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.event.SpringApplicationEvent;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * @author qingao
 * @date 2019/6/28 14:49
 **/


//@Component
@Slf4j
public class Eventlistener implements ApplicationListener {
//    @EventListener
    public  void listener(ApplicationEvent event) {
        log.info("Listened Event:" + event.toString());
    }

    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        listener(event);
    }
}
