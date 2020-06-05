package com.cch.springcloud.service.impl;

import com.cch.springcloud.mapper.StorageMapper;
import com.cch.springcloud.service.StorageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Slf4j
@Service
public class StorageServiceImpl implements StorageService{

    @Resource
    private StorageMapper storageMapper;

    @Override
    public void decrease(Long product_id, Integer count) {
        log.info("------->开始扣减库存");
        storageMapper.decrease(product_id, count);
        log.info("------->扣减库存结束");
    }
}
