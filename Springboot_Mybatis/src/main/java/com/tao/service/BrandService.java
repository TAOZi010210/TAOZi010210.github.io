package com.tao.service;

import com.tao.domain.Brand;
import org.apache.ibatis.annotations.*;

import java.util.List;


public interface BrandService {

    boolean save(Brand brand);

    boolean delete(Integer id);

    //批量删除
    boolean deleteByIds(Integer[] ids);

    boolean update(Brand brand);

    Brand getById(Integer id);

    List<Brand> getAll();

    List<Brand> selectByConditions(Brand brand);
}
