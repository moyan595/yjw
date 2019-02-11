package com.sale.phonesale.ctrl.phonetype;

import com.sale.phonesale.condition.phonetype.PhoneTypeCondition;
import com.sale.phonesale.pojo.PhoneType;
import com.sale.phonesale.service.phonetype.PhoneTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("phonetype")
public class PhoneTypeCtrl {

    @Autowired
    private PhoneTypeService phoneTypeService;

    @RequestMapping("table")
    public Map<String, Object> table(@RequestParam(value = "start", required = true, defaultValue = "0") int start,
                                     @RequestParam(value = "rows", required = true, defaultValue = "5") int rows,
                                     PhoneTypeCondition condition) {
        Map<String, Object> result = new HashMap<String, Object>();
        result.put("total", phoneTypeService.getTotal(condition));
        result.put("rows", phoneTypeService.getItems(start, rows, condition));
        return result;
    }

    @RequestMapping("add")
    public String add(PhoneType phoneType) {
        phoneTypeService.add(phoneType);
        return "success...";
    }
}
