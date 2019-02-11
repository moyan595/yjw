package com.sale.phonesale.dao.phonetype;

import com.sale.phonesale.condition.phonetype.PhoneBrandCondition;
import com.sale.phonesale.pojo.PhoneBrand;

import java.util.List;

public interface PhoneBrandDAO {
    /**
     * 查询总数
     * @return
     */
    public int getBrandTotal();
    /**
     * 查询所有手机品牌
     * @return
     */
    public List<PhoneBrand> findAll(PhoneBrandCondition condition);

    /**
     * 编辑品牌信息
     * @param phoneBrand
     */
    public void editbrand(PhoneBrand phoneBrand);

    /**
     * 添加品牌
     * @param phoneBrand
     */
    public void addBrand(PhoneBrand phoneBrand);

    /**
     * 删除品牌
     * @param brandId
     */
    public void deleteBrand(int brandId);
}
