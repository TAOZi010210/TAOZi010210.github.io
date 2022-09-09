package com.tao.service;

import com.tao.domain.Brand;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface BrandService {

    boolean save(Brand brand);

    boolean delete(Integer id);

    boolean update(Brand brand);

    Brand getById(Integer id);

    List<Brand> getAll();

    boolean deleteByIds(Integer[] ids);

    List<Brand> selectByConditions(Brand brand);
}
