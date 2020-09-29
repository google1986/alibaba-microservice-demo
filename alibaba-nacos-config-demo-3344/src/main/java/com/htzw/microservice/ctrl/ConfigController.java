package com.htzw.microservice.ctrl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author gu.lian.jun
 * @version 1.0
 * @date 2020/9/28 9:44
 */
@RestController
@RefreshScope  //支持nacos的动态刷新功能
public class ConfigController {
    @Value("${config.info}")
    private String configInfo;

    @GetMapping("/config/info")
    public String getConfigInfo() {
        return configInfo;
    }
}
