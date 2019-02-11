package com.sale.phonesale.service.phonetype.impl;

import com.sale.phonesale.condition.phonetype.PhoneTypeCondition;
import com.sale.phonesale.dao.phonetype.PhoneTypeDAO;
import com.sale.phonesale.pojo.PhoneType;
import com.sale.phonesale.service.phonetype.PhoneTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class PhoneTypeServiceImpl implements PhoneTypeService {

    @Autowired
    private PhoneTypeDAO phoneTypeDAO;

    @Override
    public int getTotal(PhoneTypeCondition condition) {
        return phoneTypeDAO.getTotal(condition);
    }

    @Override
    public List<PhoneType> getItems(int start, int rows, PhoneTypeCondition condition) {
        return phoneTypeDAO.getItems(start,rows,condition);
    }

    @Override
    public void edit(PhoneType phoneType) {
        phoneTypeDAO.edit(phoneType);
    }

    @Override
    public void add(PhoneType phoneType) {
        phoneTypeDAO.add(phoneType);
    }

    @Override
    public void delete(int modelId) {
        phoneTypeDAO.delete(modelId);
    }
}
