package com.ps.educational.service.service.Imp;

import com.ps.educational.data.bean.Userlogin;
import com.ps.educational.data.dao.UserloginMapper;
import com.ps.educational.service.service.UserloginService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class UserloginServiceImp implements UserloginService {

    @Resource
    UserloginMapper userloginMapper;

    @Override
    public int deleteByPrimaryKey(Integer userid) {
        return userloginMapper.deleteByPrimaryKey(userid);
    }

    @Override
    public int insert(Userlogin record) {
        return userloginMapper.insert(record);
    }

    @Override
    public Userlogin selectByPrimaryKey(Integer userid) {
        return userloginMapper.selectByPrimaryKey(userid);
    }

    @Override
    public List<Userlogin> selectAll() {
        return userloginMapper.selectAll();
    }

    @Override
    public int updateByPrimaryKey(Userlogin record) {
        return userloginMapper.updateByPrimaryKey(record);
    }

    @Override
    public Userlogin login(Userlogin user) {
        return userloginMapper.login(user);
    }
}
