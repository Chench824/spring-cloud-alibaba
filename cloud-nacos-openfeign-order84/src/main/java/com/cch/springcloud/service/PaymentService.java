package com.cch.springcloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
@FeignClient(value = "cloud-nacos-provider",fallback = PaymentServiceFallback.class)
public interface PaymentService {

    @GetMapping("/payment/get")
    public String getPort();
}
