package com.spring.rabbitmq.bootstarp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author 李永刚
 * @Param
 */
@SpringBootApplication(scanBasePackages = "com.spring.rabbitmq")
public class springbootRabbitMqApplication {
    public static void main(String[] args) {
        SpringApplication.run(springbootRabbitMqApplication.class,args);
    }
}
