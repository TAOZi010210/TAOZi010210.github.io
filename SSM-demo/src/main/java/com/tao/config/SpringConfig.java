package com.tao.config;

import org.springframework.context.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
//@ComponentScan(value = "com.tao",
//        excludeFilters = @ComponentScan.Filter(
//                type = FilterType.ANNOTATION,classes = Controller.class)
//)
@ComponentScan({"com.tao.service"})
@PropertySource("classpath:jdbc.properties")
@Import({JdbcConfig.class,MybatisConfig.class})
@EnableTransactionManagement
public class SpringConfig {
}
