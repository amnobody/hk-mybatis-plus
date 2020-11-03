package com.howard.hkibatis.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import com.howard.hkibatis.sql.EasySqlInjector;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author ChenJiWei
 * @version V1.0
 * @date 2020/10/20
 * @description
 */
@Configuration
public class MybatisPlusConfig {

    @Bean
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();
    }

    @Bean
    public EasySqlInjector easySqlInjector() {
        return new EasySqlInjector();
    }

}
