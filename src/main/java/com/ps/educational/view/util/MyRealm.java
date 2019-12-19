package com.ps.educational.view.util;

import com.ps.educational.data.bean.Userlogin;
import com.ps.educational.service.service.UserloginService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.realm.AuthenticatingRealm;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class MyRealm extends AuthenticatingRealm {
    @Resource
    UserloginService userloginService;

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        System.out.println("进入认证方法");
        //1，获取令牌中的数据，账号
        UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;
        Userlogin userlogin=new Userlogin();
        userlogin.setUsername(token.getUsername());
        userlogin.setPassword(new String(token.getPassword()));
        //2，通过账号查询获取MongoDB数据库中对应的账号信息
       Userlogin user = userloginService.login(userlogin);

        Subject subject = SecurityUtils.getSubject();
        //将查询的对象放进去subject自带的session中去
        subject.getSession().setAttribute("user", user);
        System.out.println(user.getRole().get(0).getPermissions().get(0).toString());
        //如果有数据，对象为非null，说明查询到了数据，封装account返回
        if (user != null){
            return new SimpleAuthenticationInfo(user,user.getPassword(),getName());
        }else {
            //如果对象为空，return null就会抛出账户不存在异常
            return null;
        }
    }
}
