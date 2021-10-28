package com.lyy.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @program: springMVC
 * @description:
 * @author: ly
 * @create: 2021-10-27 13:04
 **/
@Controller
public class UserController {
    /**
     * 使用RESTFul模拟用户资源的增删改查
     * /user   GET  查询所有的用户信息
     * /user/1   GET  根据用户id查询用户信息
     * /user/1   DELETE     根据用户id删除用户信息
     * /user   GET  查询所有的用户信息
     * /user   PUT  更新用户信息
     *
     */
    @RequestMapping(value ="/user",method = RequestMethod.GET)
    public String getAllUser(){
        System.out.println("查询所有的用户信息");
        return "success";
    }
    @RequestMapping(value = "/user/{id}",method = RequestMethod.GET)
    public String getUserById(){
        System.out.println("根据用户id查询用户信息");
        return "success";
    }
    @RequestMapping(value = "/user",method = RequestMethod.POST)
    public String insertUser(String username,String password){
        System.out.println("添加用户信息："+username+","+password);
        return "success";
    }
    @RequestMapping(value = "/user",method =RequestMethod.PUT)
    public String updateUser(String username,String password){
        System.out.println("修改用户信息"+username+","+password);
        return "success";
    }
}