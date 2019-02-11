package com.sale.phonesale.condition.phonetype;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
public class PhoneTypeCondition {
    private String modelNameCondition;
    private int brandIdCondition;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date publishTimeStartCondition;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date publishTimeEndCondition;
}
