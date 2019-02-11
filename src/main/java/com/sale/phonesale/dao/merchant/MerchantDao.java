package com.sale.phonesale.dao.merchant;

import com.sale.phonesale.pojo.Merchant;

import java.util.List;

/**
 * <pre>
 * 用户名：Administrator
 * 类名：MerchantDao
 * 包名：com.sale.phonesale.dao.merchant
 * 工程项目名：phone-sale
 * 日期：2019年01月09日 时间： 10:07
 * </pre>
 *
 * @author Administrator
 */
public interface MerchantDao {
    /**
     * 添加 Add.
     *
     * @param merchantAdd the merchant add
     */
    void add(Merchant merchantAdd);

    /**
     * 查询 Find list.
     *
     * @param find the find
     * @return the list
     */
    List<Merchant> find(Object find);

    /**
     * 删除 Delete.
     *
     * @param id the id
     * @return the list
     */
    List<Integer> delete(int id);

    /**
     * 修改|更新 Update.
     *
     * @param merchantUpdate the merchant update
     */
    void update(Merchant merchantUpdate);

}
