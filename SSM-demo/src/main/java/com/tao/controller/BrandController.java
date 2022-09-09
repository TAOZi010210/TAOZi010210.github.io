package com.tao.controller;


import com.tao.domain.Brand;
import com.tao.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@ResponseBody
@RequestMapping("http://taozi010210.github.io/SSS-demo/src/main/java/com/tao/controller/BrandController/brands")
public class BrandController {

    @Autowired
    private BrandService brandService;

    @PostMapping("/selectByConditions")
    public Result selectByConditions(@RequestBody Brand brand) {
        Integer code = brand !=null ? Code.GET_OK : Code.GET_ERR;
        String msg = brand !=null ? "success" : "数据查询失败";
        List<Brand> brands = brandService.selectByConditions(brand);
        return new Result(code,msg,brands);
    }

    @PostMapping
    public Result save(@RequestBody Brand brand) {
        boolean flag = brandService.save(brand);
        return new Result(flag ? Code.SAVE_OK : Code.SAVE_ERR,flag);
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        boolean flag = brandService.delete(id);
        return new Result(flag ? Code.DELETE_OK : Code.DELETE_ERR,flag);
    }

    @PostMapping("/deleteByIds")
    public Result deleteByIds(@RequestBody Integer[] ids) {

        System.out.println(ids);
        boolean flag = brandService.deleteByIds(ids);
        return new Result(flag ? Code.DELETE_OK : Code.DELETE_ERR,flag);
//        return new Result(Code.DELETE_ERR,null);
    }

    @PutMapping
    public Result update(@RequestBody Brand brand) {
        boolean flag = brandService.update(brand);
        return new Result(flag ? Code.UPDATE_OK : Code.UPDATE_ERR,flag);
    }

    @GetMapping("/{id}")
    public Result getById(@PathVariable Integer id) {
        Brand brand = brandService.getById(id);
        Integer code = brand !=null ? Code.GET_OK : Code.GET_ERR;
        String msg = brand !=null ? "success" : "数据查询失败";
        return new Result(code,msg,brand);
    }

    @GetMapping
    public Result getAll() {
        List<Brand> brands = brandService.getAll();
        Integer code = brands !=null ? Code.GET_OK : Code.GET_ERR;
        String msg = brands !=null ? "success" : "数据查询失败";
        return new Result(code,msg,brands);
    }

}
