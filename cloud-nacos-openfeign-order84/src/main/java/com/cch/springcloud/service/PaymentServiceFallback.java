package com.cch.springcloud.service;

import org.springframework.stereotype.Component;

@Component
public class PaymentServiceFallback implements PaymentService{
    @Override
    public String getPort() {
        return "不好意思，当前访问人数较多，请稍后再试";
    }
}
