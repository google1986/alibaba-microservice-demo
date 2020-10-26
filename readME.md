# Spring Cloud Alibaba

## Alibaba综述

### 为什么

1. Spring Cloud Netflix项目进入维护模式，Spring Cloud Netflix将不再开发新的组件
2. 维护模式，意味着Spring Cloud团队将不会再向模块中添加新功能

### 是什么

2018.10.31，Spring Cloud Alibaba正式入驻Spring Cloud官方孵化器，并在Maven中央库发布了第一个版本

Spring Cloud Alibaba，它是有一些阿里巴巴的开源组件和云产品组成的，这个项目的目的是为了让大家所熟知的Spring框架，其优秀的设计模式和抽象理念，以给使用阿里巴巴产品的Java开发者带来使用Spring Boot和Spring Cloud的更多便利。

### 能干什么

| 类型           | 描述                                                         |
| -------------- | ------------------------------------------------------------ |
| 服务限流降级   | 默认支持Servlet、Feign、RestTemplate、Dubbo和RocketMQ限流降级功能的接入，可以在运行时通过控制台实时修改限流降级规则，还支持查看限流降级Metrics监控 |
| 服务注册与发现 | 适配Spring Cloud服务注册与发现标准，默认集成Ribbon的支持     |
| 分布式配置管理 | 支持分布式系统中的外部化配置，配置更改时自动刷新             |
| 消息驱动能力   | 基于Spring Cloud Stream为微服务应用构建消息驱动能力          |
| 阿里云对象存储 | 阿里云提供的海量、安全、低成本、高可靠的云存储服务。支持在任何应用、任何时间、任何地点存储和访问任意类型的数据 |
| 分部署任务调度 | 提供秒级、精准、高可靠、高可用的定时（基于Cron表达式）任务调度服务。同时提供分布式的任务执行模型，如网格任务。网格任务支持海量子任务均匀分配到所有Worker（schedulerx-client）上执行 |

### 产品介绍

| 名称                     | 描述                                                         |
| ------------------------ | ------------------------------------------------------------ |
| Sentinel                 | 阿里巴巴开源产品，把流量作为切入点，从流量控制、熔断降级、系统负载保护等多维度保护服务的稳定性 |
| Nacos                    | 阿里巴巴开源产品，一个更易于构建云原生应用的动态服务发现，配置管理和服务管理平台 |
| RocketMQ                 | Apache RocketMQ是基于Java的高性能、高吞吐量的分布式消息和流计算平台 |
| Dubbo                    | Apache Dubbo是一款高性能的Java RPC框架                       |
| Seata                    | 阿里巴巴开源产品，一个易于使用的高性能微服务分部署事务解决方案 |
| Alibaba Cloud OSS        | 阿里云对象存储服务，是阿里云提供的海量、安全、低成本、高可靠的云存储服务 |
| Alibaba Cloud SchedulerX | 阿里中间件团队开发的一款分布式任务调度产品，支持周期性的任务与固定时间点触发任务 |

## Nacos服务注册和配置中心

### 概述

- 一个更易于构建云原生应用的动态服务发现，配置管理和服务管理平台。
- Nacos：Dynamic Naming and Configuration Service
- Nacos就是**注册中心+配置中心**的组合(等价于：Eureka+Config+Bus)
- Nacos可以替代Eureka作为服务注册中心
- Nacos可以替代Config做服务配置中心

### 各种注册中心比较

| 对比维度        | Nacos                      | Eureka      | Consul            | CoreDNS | ZooKeeper   |
| --------------- | -------------------------- | ----------- | ----------------- | ------- | ----------- |
| 一致性协议      | CP+AP                      | AP          | CP                | ——      | CP          |
| 健康检查        | TCP/HTTP/MySQL/Client Beat | Client Beat | TCP/HTTP/gRPC/Cmd | ——      | Client Beat |
| 负载均衡        | 权重/DSL/metadata/CMDB     | Ribbon      | Fabio             | RR      | ——          |
| 雪崩保护        | 支持                       | 支持        | 不支持            | 不支持  | 不支持      |
| 自动注销实例    | 支持                       | 支持        | 不支持            | 不支持  | 支持        |
| 访问协议        | HTTP/DNS/UDP               | HTTP        | HTTP/DNS          | DNS     | TCP         |
| 监听支持        | 支持                       | 支持        | 支持              | 不支持  | 支持        |
| 多数据中心      | 支持                       | 支持        | 支持              | 不支持  | 不支持      |
| 跨注册中心      | 支持                       | 不支持      | 支持              | 不支持  | 不支持      |
| SpringCloud集成 | 支持                       | 支持        | 支持              | 不支持  | 不支持      |
| Dubbo集成       | 支持                       | 不支持      | 不支持            | 不支持  | 支持        |
| K8s集成         | 支持                       | 不支持      | 支持              | 支持    | 不支持      |

### Nacos作为服务注册中心