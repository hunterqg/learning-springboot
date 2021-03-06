package com.qingao.learning.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import javax.websocket.Session;

/**
 * @author qingao
 * @email gao.qin@linkedcare.cn
 * @date 2019/5/29 16:25
 **/
@RestController
@Slf4j
public class IndexController {

    @Autowired
    private RedisTemplate redisTemplate;
    @RequestMapping(value = {"/index","/"}, method = RequestMethod.GET)
    @Cacheable("index")
    public String index() {
        log.info("index.....");
        return "Hello Spring boot!!!!";
    }

    @RequestMapping(value = "/redis/save",method = RequestMethod.GET)
    public String redisSave(@RequestParam String value) {
        redisTemplate.opsForValue().set("save",value);
        return value;
    }

    @RequestMapping(value = "/session",method = RequestMethod.GET)
    public String session(@RequestParam String value, HttpSession session) {
        session.setAttribute("sss",value);
        return value;
    }

    @Value("${spring.test.p1}")
    private  String testP1;

    @Value("${spring.test.p2}")
    private String testP2;
    @Value("${spring.test.p3:p3}")
    private String testP3;

    @Value("${spring.datasource.username:name}")
    private String uname;
    @RequestMapping(value = "/prop",method = RequestMethod.GET)
    public String prop() {
        return String.format("%s\n%s\n%s & %s",testP1,testP2,testP3,uname);
    }


}
