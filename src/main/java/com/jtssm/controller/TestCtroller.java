package com.jtssm.controller;


import com.jtssm.pojo.Test;
import com.jtssm.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/")
public class TestCtroller {
    @Autowired
    TestService service;

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public ModelAndView Index() {
        ModelAndView mv = new ModelAndView();
        List<Test> allUser = service.getAllList();
        mv.setViewName("test");
        mv.addObject("userList", allUser);
        return mv;
    }
}
