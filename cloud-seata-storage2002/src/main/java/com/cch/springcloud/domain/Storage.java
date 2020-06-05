package com.cch.springcloud.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Storage {
    private Long id;
    private Long product_id;
    private Integer count;
    private Integer used;
    private Integer residue;
}
