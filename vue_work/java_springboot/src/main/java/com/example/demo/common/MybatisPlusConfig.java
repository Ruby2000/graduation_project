package com.example.demo.common;

import javafx.scene.control.Pagination;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class MybatisPlusConfig {
    @Bean
    public  PaginationInterceptor paginationInterceptor(){
        return new PaginationInterceptor();
    }
}
