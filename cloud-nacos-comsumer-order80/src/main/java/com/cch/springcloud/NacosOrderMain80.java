package com.cch.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class NacosOrderMain80 {
    public static void main(String[] args) {
        SpringApplication.run(NacosOrderMain80.class,args);
    }
}
