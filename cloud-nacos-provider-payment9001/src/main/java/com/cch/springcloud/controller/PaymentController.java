package com.cch.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class PaymentController {

    @Value(value = "${server.port}")
    private String port;

    @GetMapping("/payment/get")
    public String getPort(){
//        int a = 10/0;
        return UUID.randomUUID().toString()+"  :"+port;
    }
}
