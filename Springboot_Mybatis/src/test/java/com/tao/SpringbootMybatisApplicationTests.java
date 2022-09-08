package com.tao;

import com.tao.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootMybatisApplicationTests {

    @Autowired
    private BrandService brandService;

    @Test
    void getById(){
        System.out.println(brandService.getById(34));
    }
}
