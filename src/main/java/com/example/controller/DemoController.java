package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * JavaBookManagementSystem
 * 测试
 *
 * @author PlutoCtx ctx195467@163.com
 * @version 2025/1/12 11:09
 * @since JDK17
 */

@Controller
public class DemoController {


    @RequestMapping("adminLogin")
    public String redirect(String username,
                           String password) {

        System.out.println(username);
        System.out.println(password);

        return "admin-page";
    }


}
