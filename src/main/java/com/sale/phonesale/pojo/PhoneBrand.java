package com.sale.phonesale.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PhoneBrand {
    private int brandId;
    private String brandName;
    private int popularity = 1;//热门品牌 包括3个等级：1. 普通，2. 热门，3. 爆款品牌
}
