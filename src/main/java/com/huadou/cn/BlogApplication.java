package com.huadou.cn;

/**
 * Created by jinliang on 16-10-14.
 */


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;

import javax.servlet.MultipartConfigElement;

/**
 * 程序的主要的入口操作
 */

@MapperScan("com.huadou.cn.datasource.model.mapper")
@SpringBootApplication
@ServletComponentScan
public class BlogApplication  extends SpringBootServletInitializer {

    @Bean
    public MultipartConfigElement multipartConfigElement() {
        MultipartConfigFactory factory = new MultipartConfigFactory();
        factory.setMaxFileSize("5MB");
        factory.setMaxRequestSize("5MB");
        return factory.createMultipartConfig();
    }

    // 主入口
    public static void main(String[] args) {
        SpringApplication.run(BlogApplication.class);
    }
}
