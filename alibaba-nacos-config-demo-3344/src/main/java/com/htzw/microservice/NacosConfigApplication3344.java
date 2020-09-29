package com.htzw.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author gu.lian.jun
 * @version 1.0
 * @date 2020/9/28 9:43
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosConfigApplication3344 {
    public static void main(String[] args) {
        SpringApplication.run(NacosConfigApplication3344.class, args);
    }
}
