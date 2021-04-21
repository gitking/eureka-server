package com.atguigu.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * https://developer.aliyun.com/lesson_1913_16409#_16409
 * 第6章 » 课时35 SpringCloud-Eureka注册中心
 * eureka-server是注册中心项目,springcloud-consumer是消费者项目,springcloud-provider-ticket是生产者项目
 * 要先启动eureka-server注册中心这个项目
 * 1,在application.yml配置文件里面配置Eureka信息
 * 2,使用@EnableEurekaServer启动Eureka功能
 * 3,启动项目,启动成功之后可以在浏览器上访问Eureka注册中心
 */
@EnableEurekaServer
@SpringBootApplication
public class App 
{
    public static void main( String[] args )
    {
		SpringApplication.run(App.class, args);
    }
}
