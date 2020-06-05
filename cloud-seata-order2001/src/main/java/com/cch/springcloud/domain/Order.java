package com.cch.springcloud.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {

    private Long id;
    private Long user_id;
    private Long product_id;
    private Integer count;
    private BigDecimal money;
    private Integer status;//0:未支付  1:已支付
}

