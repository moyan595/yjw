package com.sale.phonesale.ctrl.phonetype;

import com.sale.phonesale.condition.phonetype.PhoneBrandCondition;
import com.sale.phonesale.pojo.PhoneBrand;
import com.sale.phonesale.service.phonetype.PhoneBrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * 添加平牌信息
 */
@RestController
@RequestMapping("phonebrand")
public class PhoneBrandCtrl {

    @Autowired
    private PhoneBrandService phoneBrandService;

    /**
     * 列出所有品牌信息
     * @return
     */
    @GetMapping("list")
    public Map<String, Object> list() {
        Map<String, Object> result = new HashMap<String, Object>();
        result.put("total", phoneBrandService.getBrandTotal());
        result.put("rows", phoneBrandService.findAll(new PhoneBrandCondition()));
        return result;
    }

    @GetMapping("addbrand")
    public String addBrand(PhoneBrand phoneBrand) {
        phoneBrandService.addBrand(phoneBrand);
        return "Success!";
    }
}
