package com.sale.phonesale.dao.phonetype;


import com.sale.phonesale.condition.phonetype.PhoneTypeCondition;
import com.sale.phonesale.pojo.PhoneType;

import java.util.List;

public interface PhoneTypeDAO {

    /**
     * 查询机型总记录数
     * @return
     */
    public int getTotal(PhoneTypeCondition condition);

    /**
     * 查询所有记录
     * @param start
     * @param rows
     * @param condition
     * @return
     */
    public List<PhoneType> getItems(int start, int rows, PhoneTypeCondition condition);

    /**
     * 编辑机型内容, 上调 下跌 热门度
     * @param phoneType
     */
    public void edit(PhoneType phoneType);

    /**
     * 新增机型
     * @param phoneType
     */
    public void add(PhoneType phoneType);

    /**
     * 删除机型
     * @param modelId
     */
    public void delete(int modelId);
}
