package com.ps.educational.service.service.Imp;

import com.ps.educational.data.bean.College;
import com.ps.educational.data.dao.CollegeMapper;
import com.ps.educational.service.service.CollegeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class CollegeServiceImp implements CollegeService {
    @Resource
    CollegeMapper collegeMapper;
    @Override
    public int deleteByPrimaryKey(Integer collegeid) {
        return collegeMapper.deleteByPrimaryKey(collegeid);
    }

    @Override
    public int insert(College record) {
        return collegeMapper.insert(record);
    }

    @Override
    public College selectByPrimaryKey(Integer collegeid) {
        return collegeMapper.selectByPrimaryKey(collegeid);
    }

    @Override
    public List<College> selectAll() {
        return collegeMapper.selectAll();
    }

    @Override
    public int updateByPrimaryKey(College record) {
        return collegeMapper.updateByPrimaryKey(record);
    }
}
