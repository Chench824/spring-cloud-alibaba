package com.cch.springcloud.service.impl;

import com.cch.springcloud.domain.Order;
import com.cch.springcloud.mapper.OrderMapper;
import com.cch.springcloud.service.AccountService;
import com.cch.springcloud.service.OrderService;
import com.cch.springcloud.service.StorageService;
import io.seata.spring.annotation.GlobalTransactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
@Slf4j
public class OrderServiceImpl implements OrderService{
    @Resource
    private OrderMapper orderMapper;
    @Autowired
    private StorageService storageService;
    @Autowired
    private AccountService accountService;

    @Override
    @GlobalTransactional(name = "tsp_group",rollbackFor = Exception.class)
    public void create(Order order) {
        log.info("------>开始新建订单");
        orderMapper.create(order);

        log.info("------->开始扣减库存");
        storageService.decrease(order.getProduct_id(),order.getCount());
        log.info("------->扣减库存结束");

        log.info("-------->开始扣减余额");
        accountService.decrease(order.getUser_id(),order.getMoney());
        log.info("-------->扣减余额结束");

        log.info("-------->开始修改状态");
        orderMapper.update(order.getUser_id(),0);
        log.info("-------->状态修改结束");

        log.info("下订单完成啦O(∩_∩)O哈哈~");
    }
}
