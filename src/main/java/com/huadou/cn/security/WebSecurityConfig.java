package com.huadou.cn.security;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * Created by jinliang on 16/10/15.
 */

@Configurable
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true) // 允许进入界面方法前检验
public class WebSecurityConfig  extends WebSecurityConfigurerAdapter{

}
