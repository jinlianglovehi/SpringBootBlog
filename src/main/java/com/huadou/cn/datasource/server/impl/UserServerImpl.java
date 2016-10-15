package com.huadou.cn.datasource.server.impl;

import java.util.List;

import com.huadou.cn.datasource.model.User;
import com.huadou.cn.datasource.model.mapper.UserMapper;
import com.huadou.cn.datasource.server.UserServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * 用户相关数据库操作实现类
 * @author Raye
 * @since 2016年10月11日19:29:02
 */
@Repository
public class UserServerImpl implements UserServer {
	@Autowired
	private UserMapper mapper;
	
	public boolean add(User user) {
		return mapper.insert(user) > 0;
	}

	public List<User> findAll() {
		return mapper.selectByExample(null);
	}

}
