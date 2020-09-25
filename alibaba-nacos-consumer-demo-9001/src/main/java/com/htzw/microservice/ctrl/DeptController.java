package com.htzw.microservice.ctrl;

import com.htzw.microservice.entities.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author gu.lian.jun
 * @version 1.0
 * @date 2020/9/25 9:48
 */
@RestController
public class DeptController {
    @Autowired
    private RestTemplate restTemplate;

    @Value("${server-url.nacos-dept-service}")
    private String deptServiceUrl;

    @PostMapping(value="/consumer/dept/add")
    public boolean add(Dept dept)
    {
        return restTemplate.postForObject(deptServiceUrl+"/dept/add", dept, Boolean.class);
    }

    @GetMapping(value="/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id)
    {
        return restTemplate.getForObject(deptServiceUrl+"/dept/get/"+id, Dept.class);
    }

    @GetMapping(value="/consumer/dept/list")
    public List<Dept> list()
    {
        return restTemplate.getForObject(deptServiceUrl+"/dept/list", List.class);
    }
}