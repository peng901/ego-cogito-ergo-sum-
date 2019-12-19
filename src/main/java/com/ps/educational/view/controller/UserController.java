package com.ps.educational.view.controller;

import com.ps.educational.data.bean.Student;
import com.ps.educational.data.bean.Userlogin;
import com.ps.educational.service.service.UserloginService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;


@Controller
@CrossOrigin(methods = {RequestMethod.POST,RequestMethod.GET})
public class UserController {
    @Resource
    UserloginService userloginService;

    @RequestMapping(value = "login.do",method = RequestMethod.POST)
    @ResponseBody
    public Userlogin login(Userlogin user) {
        System.out.println("进入登陆方法");
        System.out.println(user.toString());
//		1.将用户输入的账号密码 封装在token中
        UsernamePasswordToken token = new UsernamePasswordToken(user.getUsername(), user.getPassword());
//        2.获取Subject
        Subject subject = SecurityUtils.getSubject();
//        3.通过Subject 的login方法 完成登录
        try {
            subject.login(token);
            //到这里如果没有异常说明登录成功，
            return (Userlogin) subject.getSession().getAttribute("user");
        } catch (Exception e) {
            //有异常说明登录失败，重定向到登录页面
            System.out.println(e.getMessage());
            return null;
        }
    }


}
