package com.wind.web.controller.system;

import com.wind.common.core.controller.BaseController;
import com.wind.system.model.Test;
import com.wind.system.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/system/test")
public class TestController extends BaseController {

@Autowired
    private TestService testService;
    @RequestMapping("/testWind")
    public ModelAndView testWind(){
        System.out.println("hello world!!!");
        ModelAndView mv = new ModelAndView();
        mv.setViewName("test");
        List<Test> list =  testService.getTestInfo();
        for(Test t:list){
            System.out.println(t.getMobile()+t.getUserName());
        }
        mv.addObject(list);
        return mv;
    }
}
