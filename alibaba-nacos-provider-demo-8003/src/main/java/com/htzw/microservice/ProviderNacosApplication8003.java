package com.htzw.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author gu.lian.jun
 * @version 1.0
 * @date 2020/9/22 16:17
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ProviderNacosApplication8003 {

    public static void main(String[] args) {
        SpringApplication.run(ProviderNacosApplication8003.class, args);
    }
}
