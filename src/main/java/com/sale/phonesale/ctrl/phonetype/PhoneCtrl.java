package com.sale.phonesale.ctrl.phonetype;

import com.sale.phonesale.condition.phonetype.PhoneTypeCondition;
import com.sale.phonesale.service.phonetype.PhoneTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 机型页面跳转Ctrl
 */
@Controller
@RequestMapping("phonetype")
public class PhoneCtrl {

    @Autowired
    private PhoneTypeService phoneTypeService;

    @RequestMapping("list")
    public String list() {
        return "phonetype/list";
    }
}
