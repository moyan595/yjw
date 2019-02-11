package com.sale.phonesale.service.phonetype.impl;

import com.sale.phonesale.condition.phonetype.PhoneBrandCondition;
import com.sale.phonesale.dao.phonetype.PhoneBrandDAO;
import com.sale.phonesale.pojo.PhoneBrand;
import com.sale.phonesale.service.phonetype.PhoneBrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class PhoneBrandServiceImpl implements PhoneBrandService {

    @Autowired
    private PhoneBrandDAO phoneBrandDAO;

    @Override
    public int getBrandTotal() {
        return phoneBrandDAO.getBrandTotal();
    }

    @Override
    public List<PhoneBrand> findAll(PhoneBrandCondition condition) {
        return phoneBrandDAO.findAll(condition);
    }

    @Override
    public void editbrand(PhoneBrand phoneBrand) {
        phoneBrandDAO.editbrand(phoneBrand);
    }

    @Override
    public void addBrand(PhoneBrand phoneBrand) {
        phoneBrandDAO.addBrand(phoneBrand);
    }

    @Override
    public void deleteBrand(int brandId) {
        phoneBrandDAO.deleteBrand(brandId);
    }
}
