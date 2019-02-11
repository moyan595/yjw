package com.sale.phonesale.service.merchant.impl;

import com.sale.phonesale.pojo.Merchant;
import com.sale.phonesale.service.merchant.MerchantService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * <pre>
 * 用户名：Administrator
 * 类名：MerchantServiceImpl
 * 包名：com.sale.phonesale.service.merchant.impl
 * 工程项目名：phone-sale
 * 日期：2019年01月09日 时间： 11:03
 * </pre>
 *
 * @author Administrator
 */
public class MerchantServiceImpl implements MerchantService {


    /**
     * Merchant
     */
    @Autowired
    private Merchant merchantDao;

    /**
     * 添加.
     * @param merchantAdd the merchant add
     */
    @Override
    public void add(Merchant merchantAdd) {

    }

    /**
     * 删除.
     * @param id
     * @return
     */
    @Override
    public List<Integer> delete(int id) {
        return null;
    }

    /**
     * 修改.
     * @param merchantUpdate the merchant update
     */
    @Override
    public void upadte(Merchant merchantUpdate) {

    }

    /**
     * 查询| 查询所有.
     * @param find
     * @return
     */
    @Override
    public List<Merchant> findAll(Object find) {
        return null;
    }
}
