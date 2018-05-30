package com.beauty.account.controller;

import com.beauty.account.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class AccountController {
    private static final Logger logger = LoggerFactory.getLogger(AccountController.class);

    @GetMapping("/")
    public ModelAndView queryWithPage() {
        logger.info("find it");
        User u1= new User();
        u1.setId(1L);
        u1.setName("张三");
        u1.setAge(18);

        User u2= new User();
        u2.setId(2L);
        u2.setName("张麻子");
        u2.setAge(28);
        List<User> userLst = new ArrayList<>();
        userLst.add(u1);
        userLst.add(u2);

        ModelAndView mv = new ModelAndView();
        mv.setViewName("accountList");
        mv.addObject("userList", userLst);
        return mv;
    }
}
