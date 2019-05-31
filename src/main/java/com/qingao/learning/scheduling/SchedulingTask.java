package com.qingao.learning.scheduling;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @author qingao
 * @email gao.qin@linkedcare.cn
 * @date 2019/5/29 16:50
 **/
@Component
@Slf4j
public class SchedulingTask {
//    private static Logger logger = LoggerFactory.getLogger(SchedulingTask.class);
    @Scheduled(cron = "*/15 * * * * *")
    private void printTask(){
        log.info("running..");
    }

//    @Scheduled(fixedRate = 10000)
    private void fixRateTask() {
        log.info("fix rate runing........");

    }
}
