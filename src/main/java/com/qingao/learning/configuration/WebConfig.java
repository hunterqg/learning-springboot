package com.qingao.learning.configuration;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;
import java.util.Date;

/**
 * @author qingao
 * @date 2019/7/3 17:03
 **/
@Configuration
@Slf4j
public class WebConfig {

    @Bean
    public FilterRegistrationBean<MyFilter1> registrationHttpTraceFilter1() {
        FilterRegistrationBean registration = new FilterRegistrationBean(new MyFilter1());
        registration.setOrder(100);
        return registration;
    }
    @Bean
    public FilterRegistrationBean<MyFilter2> registrationHttpTraceFilter2() {
        FilterRegistrationBean registration = new FilterRegistrationBean(new MyFilter2());
        registration.setOrder(10);
        return registration;
    }

}

@Slf4j
class MyFilter1 implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        log.info("--1---", new Date());
        chain.doFilter(request,response);
    }
}

@Slf4j
class MyFilter2 implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        log.info("--2---", new Date());
        chain.doFilter(request,response);
    }
}

@Component
@WebFilter
@Slf4j
@Order(1)
class AuthFilter implements  Filter{

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        log.info("--3---", new Date());
        chain.doFilter(request,response);
    }
}