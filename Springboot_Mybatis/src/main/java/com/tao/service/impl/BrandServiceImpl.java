package com.tao.service.impl;

import com.tao.dao.BrandDao;
import com.tao.domain.Brand;
import com.tao.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrandServiceImpl implements BrandService {

    @Autowired
    private BrandDao brandDao;


    @Override
    public boolean save(Brand brand) {
        brandDao.save(brand);
        return true;
    }

    @Override
    public boolean delete(Integer id) {
        brandDao.delete(id);
        return true;
    }

    @Override
    public boolean deleteByIds(Integer[] ids) {
        brandDao.deleteByIds(ids);
        return true;
    }

    @Override
    public boolean update(Brand brand) {
        brandDao.update(brand);
        return true;
    }

    @Override
    public Brand getById(Integer id) {
        return brandDao.getById(id);
    }

    @Override
    public List<Brand> getAll() {
        return brandDao.getAll();
    }

    @Override
    public List<Brand> selectByConditions(Brand brand) {
        return brandDao.selectByConditions(brand);
    }
}
