在nacos中添加配置信息，具体的配置规则详见
理论：Nacos中的dataid的组成格式及与SpringBoot配置文件中的配置规则。
https://nacos.io/zh-cn/docs/what-is-nacos.

${spring.application.name}-${spring.profiles.active}.${spring.cloud.nacos.config.file-extension}