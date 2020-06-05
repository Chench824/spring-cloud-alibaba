package com.cch.springcloud.controller;

import com.cch.springcloud.domain.CommonResult;
import com.cch.springcloud.service.AccountService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.math.BigDecimal;

@RestController
public class AccountController {

    @Resource
    private AccountService accountService;

    @PostMapping("/account/decrease")
    CommonResult decrease(@RequestParam("user_id")Long user_id, @RequestParam("money")BigDecimal money){
        accountService.decrease(user_id, money);
        return new CommonResult(200,"扣减余额完成");
    }
}
