package com.lyy.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;

/**
 * @program: springMVC
 * @description:
 * @author: ly
 * @create: 2021-10-25 15:09
 **/
@Controller
public class ParamController {
    @RequestMapping("/testServletAPI")
    //形参位置的request表示当前请求
    public String testServletAPI(HttpServletRequest request){
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println("username:"+username+",password:"+password);
        return "success";
    }
    @RequestMapping("/testParam")
    public String testParam(
            @RequestParam(value = "user_name",required = false,defaultValue = "hehe")String username,
            String password,
            String[] hobby){
        //若请求参数中出现多个请求参数，可以在控制器方法的形参位置设置字符串类型或字符串数组来接收此请求参数
        //若使用字符串类型的形参，最终结果为请求参数的每一个值之间使用逗号进行拼接
        System.out.println("username:"+username+",password:"+password+",hobby:"+ Arrays.toString(hobby));
        return "success";
    }
}
