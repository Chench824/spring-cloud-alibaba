package com.cch.springcloud.service.impl;

import com.cch.springcloud.mapper.AccountMapper;
import com.cch.springcloud.service.AccountService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.concurrent.TimeUnit;

@Service
@Slf4j
public class AccountServiceImpl implements AccountService{

    @Resource
    private AccountMapper accountMapper;

    @Override
    public void decrease(Long user_id, BigDecimal money) {
      log.info("-------->开始扣减余额");
      try {
          TimeUnit.SECONDS.sleep(20);
      } catch (InterruptedException e) {
          e.printStackTrace();
      }
      accountMapper.decrease(user_id,money);
      log.info("-------->扣减余额成功");
    }
}
