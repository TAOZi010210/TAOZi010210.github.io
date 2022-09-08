package com.tao.controller;

import com.tao.domain.Brand;
import com.tao.service.BrandService;
import org.apache.ibatis.annotations.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/brands")
@ResponseBody
public class BrandController {

    @Autowired
    private BrandService brandService;

    @PostMapping
    public boolean save(@RequestBody Brand brand){
        return brandService.save(brand);
    }

    @DeleteMapping("{id}")
    public boolean delete(@PathVariable Integer id){
        return brandService.delete(id);
    }

    //批量删除
    @PostMapping("/deleteByIds")
    public boolean deleteByIds(@RequestBody Integer[] ids) {
        System.out.println(ids);
        return brandService.deleteByIds(ids);
    }

    @PutMapping
    public boolean update(@RequestBody Brand brand){
        return brandService.update(brand);
    }

    @GetMapping("{id}")
    public Brand getById(@PathVariable Integer id){
        return brandService.getById(id);
    }

    @GetMapping
    public List<Brand> getAll(){
        return brandService.getAll();
    }

    @PostMapping("/selectByConditions")
    public List<Brand> selectByConditions(@RequestBody Brand brand){
        return brandService.selectByConditions(brand);
    }

}
