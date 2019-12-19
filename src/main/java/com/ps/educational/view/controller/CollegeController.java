package com.ps.educational.view.controller;

import com.ps.educational.data.bean.College;
import com.ps.educational.data.bean.Student;
import com.ps.educational.service.service.CollegeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@CrossOrigin(methods = {RequestMethod.POST,RequestMethod.GET})
public class CollegeController {
    @Resource
    CollegeService collegeService;

    @RequestMapping(value = "queryColAll.do",method = RequestMethod.POST)
    @ResponseBody
    public List<College> queryColAll(){
        System.out.println("启动控制器查询queryColAll");
        List<College> list=collegeService.selectAll();
        return list;
    }
}
