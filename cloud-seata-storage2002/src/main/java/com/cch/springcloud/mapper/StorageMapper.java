package com.cch.springcloud.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface StorageMapper {
    void decrease(@Param("product_id")Long product,@Param("count")Integer count);
}
