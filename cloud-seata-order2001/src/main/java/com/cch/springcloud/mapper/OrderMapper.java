package com.cch.springcloud.mapper;

import com.cch.springcloud.domain.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface OrderMapper {

    void create(Order order);

    void update(@Param("user_id")Long user_id,@Param("status")Integer status);
}
