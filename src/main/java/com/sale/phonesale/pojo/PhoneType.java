package com.sale.phonesale.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class PhoneType {
    private int modelId;
    private String modelName;
    private int brandId;
    private int popularity = 1;//热门程度包括3个等级：1. 普通机型，2. 热门机型，3. 爆款机型
    private double upRatio;//上调率
    private double downRatio;//下跌率
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date publishTime;//发布时间
}
