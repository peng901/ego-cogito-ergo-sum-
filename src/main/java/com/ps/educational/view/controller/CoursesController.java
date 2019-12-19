package com.ps.educational.view.controller;

import com.ps.educational.data.bean.Course;
import com.ps.educational.data.bean.Student;
import com.ps.educational.service.service.CourseService;
import com.ps.educational.view.util.PageBean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@Controller
@CrossOrigin(methods = {RequestMethod.POST,RequestMethod.GET})
public class CoursesController {
    @Resource
    CourseService courseService;

    @RequestMapping(value = "queryCou.do",method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> queryCouPages(PageBean page) {
        System.out.println("启动控制器分页：queryStuPages");
        System.out.println("传递的页号：" + page.getPageNo());
        System.out.println("传递的页大小：" + page.getPageSize());
        PageBean<Course> pageBeans = courseService.queryReturnBlogPage(page.getPageNo(), page.getPageSize());
        Map<String, Object> paramsMap = new HashMap<String, Object>();
        System.out.println("控制器分页结果：" + pageBeans.toString());
        System.out.println("分页结果：" + pageBeans.getData().toString());
        paramsMap.put("list", pageBeans);
        return paramsMap;
    }

    //删除记录
    @RequestMapping(value="deleteCou.do",method = RequestMethod.POST)
    @ResponseBody
    public  boolean deleteCou(Long courseid){
        System.out.println("启动控制器删除deleteStu");
        System.out.println("删除主键："+courseid);
        if (courseService.deleteByPrimaryKey(courseid)>0){
            return true;
        }
        return false;
    }

    //新增记录
    @RequestMapping(value="addCou.do",method = RequestMethod.POST)
    @ResponseBody
    public  boolean addCou(Course course){
        System.out.println("启动控制器新增addStu");
        System.out.println(course.toString());
        if (courseService.insert(course)>0){
            return  true;
        }
        return false;
    }

    //修改记录
    @RequestMapping(value="updateCou.do",method = RequestMethod.POST)
    @ResponseBody
    public  boolean updateStu(Course course){
        System.out.println("启动控制器修改updateStu");
        System.out.println(course.toString());
        if (courseService.updateByPrimaryKey(course)>0){
            return  true;
        }
        return false;
    }
}
