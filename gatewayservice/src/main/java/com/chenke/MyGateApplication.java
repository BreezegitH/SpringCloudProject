package com.chenke;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author chenke
 * @version 1.0.0
 * @ClassName Myapplication.java
 * @Description TODO
 * @createTime 2022年05月07日 23:05:00
 */
@SpringBootApplication
@EnableDiscoveryClient
public class MyGateApplication {
    public static void main(String[] args) {
        SpringApplication.run(MyGateApplication.class);
    }
}
