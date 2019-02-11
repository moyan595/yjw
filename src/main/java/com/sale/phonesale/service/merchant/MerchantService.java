package com.sale.phonesale.service.merchant;

import com.sale.phonesale.pojo.Merchant;

import java.util.List;

/**
 * <pre>
 * 用户名：Administrator
 * 类名：MerchantService
 * 包名：com.sale.phonesale.service.merchant.service
 * 工程项目名：phone-sale
 * 日期：2019年01月09日 时间： 10:23
 * </pre>
 *
 * @author Administrator
 */
public interface MerchantService {
    /**
     * 添加 Add.
     *
     * @param merchantAdd the merchant add
     */
    void add(Merchant merchantAdd);

    /**
     * 删除 Delete.
     *
     * @param id the id
     * @return the list
     */
    List<Integer> delete(int id);

    /**
     * 修改 \ 更新 Upadte.
     *
     * @param merchantUpdate the merchant update
     */
    void upadte(Merchant merchantUpdate);

    /**
     * 查询所有| 单个查询 Find all list.
     *
     * @param find the find
     * @return the list
     */
    List<Merchant> findAll(Object find);

}
