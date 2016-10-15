package com.huadou.cn;

import com.huadou.cn.datasource.model.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Created by jinliang on 16-10-14.
 */

/**
 *  swaggerConfig 之间的配置信息
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    /**
     * 可以定义多个组，比如本类中定义把test和demo区分开了
     * （访问页面就可以看到效果了）
     *
     */
    @Bean
    public Docket testApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo()).ignoredParameterTypes(User.class)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.huadou.cn"))
                .paths(PathSelectors.any())
                .build();
    }



    private ApiInfo apiInfo() {
        ApiInfo apiInfo = new ApiInfo("金亮的SpingBoot  Blog ",//大标题
                "Spring boot + swagger + mybatis + druid",//小标题
                "1.0",//版本
                "NO terms of service",
                "admin@raye.wang",//作者
                "RayeBlog",//链接显示文字
                "http://www.raye.wang/"//网站链接
        );

        return apiInfo;
    }
}
