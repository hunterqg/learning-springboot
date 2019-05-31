package com.qingao.learning.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

/**
 * @author qingao
 * @email gao.qin@linkedcare.cn
 * @date 2019/5/30 17:22
 **/
@Configuration
@EnableRedisHttpSession(maxInactiveIntervalInSeconds = 30*60)
public class SessionConfig {
}
