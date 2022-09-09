package com.tao.dao;

import com.tao.domain.Brand;
import org.apache.ibatis.annotations.*;


import java.util.List;

public interface BrandDao {

    @Insert("insert into brand values (null,#{brandName},#{companyName},#{description},#{status})")
    @ResultMap("Brand")
    void save(Brand brand);

    @Delete("delete from brand where id = #{id}")
    void delete(Integer id);

    //批量删除
    @ResultMap("Brand")
    void deleteByIds(@Param("ids") Integer[] ids);

    @Update("update brand set brand_name=#{brandName},company_name=#{companyName},description=#{description},status=#{status} where id=#{id}")
    @ResultMap("Brand")
    void update(Brand brand);

    @Select("select * from brand where id=#{id}")
    @ResultMap("Brand")
    Brand getById(Integer id);

    @Select("select * from brand")
    @ResultMap("Brand")
    List<Brand> getAll();


    List<Brand> selectByConditions(@Param("brand") Brand brand);

}
