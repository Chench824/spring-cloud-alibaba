package com.cch.springcloud.controller;

import com.cch.springcloud.domain.CommonResult;
import com.cch.springcloud.service.StorageService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class StorageController {

    @Resource
    private StorageService storageService;

    @RequestMapping("/storage/decrease")
    public CommonResult decrease(Long product_id,Integer count){
        storageService.decrease(product_id,count);
        return new CommonResult(200,"库存扣减成功");
    }
}
