package com.sale.phonesale.pojo;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 用户名：Administrator
 * 类名：Merchant
 * 包名：com.sale.phonesale.pojo
 * 工程项目名：phone-sale
 * 日期：2019年01月09日 时间： 9:10
 *
 * @author Administrator
 */
public class Merchant {
    /**
     * 商家ID.
     */
    private Integer id;
    /**
     * 商家名称 Name.
     */
    private String userName;
    /**
     * 商家登录账户 Account.
     */
    private String account;
    /**
     * 商家登录密码 Password.
     */
    private String password;
    /**
     * 商家地址 Address.
     */
    private String address;
    /**
     * 商家联系姓名 Contacts name.
     */
    private String contactsName;
    /**
     * 商家联系电话 Phone.
     */
    private String phone;
    /**
     * 商家账号状态: 1: 正常可登录,  2: 不可登陆 , 3：待选商家用户 0: 黑名单 State.
     */
    private Integer state;
    /**
     * 商家钱包余额 Money.
     */
    private BigDecimal money;
    /**
     * 商家用户等级 Level.
     */
    private Integer level;
    /**
     * 商家创建账号时间 Create time.
     */
    private Date createTime;
    /**
     * 商家修改账号时间 time.
     */
    private Date upadteTime;
}
