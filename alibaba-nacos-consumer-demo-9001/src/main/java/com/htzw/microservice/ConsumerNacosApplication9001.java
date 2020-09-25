package com.htzw.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author gu.lian.jun
 * @version 1.0
 * @date 2020/9/25 9:48
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ConsumerNacosApplication9001 {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerNacosApplication9001.class, args);
    }
}
