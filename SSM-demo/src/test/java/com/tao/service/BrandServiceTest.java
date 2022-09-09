package com.tao.service;

import com.tao.config.SpringConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class BrandServiceTest {

    @Autowired
    private BrandService brandService;

    @Test
    public void testGetById(){
        System.out.println(brandService.getById(1));
        System.out.println(brandService.getAll());
    }


}
