package com.cch.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class OrderController {

    @Value("${service-url.nacos-user-service}")
    private  String server_url;
    @Value("${service-url.nacos-config-service}")
    private String config;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/order/get")
    private String getPort(){
        return restTemplate.getForObject(server_url+"/payment/get/",String.class);
    }

    @GetMapping("/order/getConfig")
    public String getConfig(){
        return restTemplate.getForObject(config+"/config/get/",String.class);
    }


}
