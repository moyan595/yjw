package com.sale.phonesale.ctrl.longin;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginCtl {

    @RequestMapping("login")
    public String login(ModelMap map){
        map.put("hello","nihao");
        System.out.println("请求链接");
        return "login/login";
    }

    @RequestMapping("/logout")
    public String logout(){
        return null;
    }
}
