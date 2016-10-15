package com.huadou.cn.datasource.controller;

import com.huadou.cn.datasource.model.User;
import com.huadou.cn.datasource.server.UserServer;
import com.huadou.cn.datasource.tools.Utils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jinliang on 16-10-14.
 *
 * 用户信息 Controller
 */
@Api(value = "用户相接口")
@RestController
@RequestMapping("/user")
public class UserController {


    private static final String TAG = UserController.class.getSimpleName();
    @Autowired
    private UserServer server;
    /**
     * 添加用户
     * @param user 用户对象
     * @since 2016年9月21日21:01:50
     */
    @RequestMapping("/add")
    @ApiOperation(notes="添加用户",value="添加一个用户",httpMethod="POST")

    @ApiImplicitParams({
            @ApiImplicitParam(name="username",paramType="query",dataType="string"),
            @ApiImplicitParam(name="psw",paramType="query",dataType="string")
    })
    public String add(User user){
        Utils.printLog(TAG , "addUser" , " username:"+ user.getUsername() + "," +",password:"+ user.getPsw() );
        return "hello "+server.add(user);
    }



    /**
     * 查询所有用户
     * @since 2016年9月22日20:32:43
     * @return
     */
    @RequestMapping("/all")
    @ApiOperation(notes="查询所有用户",value="查询所有有，目前只返回数量",httpMethod="GET")
    public String find(){
        return ""+server.findAll().size();
    }
}
