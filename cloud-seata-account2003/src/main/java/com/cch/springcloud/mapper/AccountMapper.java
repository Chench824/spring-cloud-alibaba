package com.cch.springcloud.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;

@Mapper
public interface AccountMapper {

    void decrease(@Param("user_id")Long user_id, @Param("money")BigDecimal money);
}
