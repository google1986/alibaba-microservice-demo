package com.htzw.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;

/**
 * @author gu.lian.jun
 * @version 1.0
 * @date 2020/9/25 9:48
 */
@SpringBootApplication
@EnableDiscoveryClient //注册nacos
@EnableFeignClients(basePackages = "com.htzw.microservice")  //开启Feign
@ComponentScan("com.htzw.microservice")
public class ConsumerNacosFeignApplication9002 {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerNacosFeignApplication9002.class, args);
    }

    /**
     * @return
     * @LoadBalanced : 负载均衡，默认为轮询
     */
    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
