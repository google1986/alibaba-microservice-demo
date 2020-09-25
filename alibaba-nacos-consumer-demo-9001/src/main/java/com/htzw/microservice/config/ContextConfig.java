package com.htzw.microservice.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author gu.lian.jun
 * @version 1.0
 * @date 2020/9/25 9:52
 */
@Configuration
public class ContextConfig {
    /**
     * @LoadBalanced : 负载均衡，默认为轮询
     * @return
     */
    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
