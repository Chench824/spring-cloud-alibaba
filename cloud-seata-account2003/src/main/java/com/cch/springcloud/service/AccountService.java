package com.cch.springcloud.service;


import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

public interface AccountService {

    void decrease(@RequestParam("user_id")Long user_id, @RequestParam("money")BigDecimal money);
}
