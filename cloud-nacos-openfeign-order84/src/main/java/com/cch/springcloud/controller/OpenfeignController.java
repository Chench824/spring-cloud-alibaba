package com.cch.springcloud.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.cch.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OpenfeignController {

    @Autowired
    private PaymentService paymentService;

    @GetMapping("/payment/get")
    public String getPort(){
        return paymentService.getPort();
    }

    @GetMapping("/payment/test")
    @SentinelResource(value = "byResource",blockHandler = "deal_method")
    public String test(){
        return "哈哈哈O(∩_∩)O哈哈~成功";
    }
    public String deal_method(BlockException exception){
        return "不好意思，出错了" + exception.toString();
    }
}
