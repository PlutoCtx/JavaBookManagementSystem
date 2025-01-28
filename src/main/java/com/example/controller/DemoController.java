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

        return "admin/admin-home";
    }


    @RequestMapping("book")
    public String redirectToBook() {
        return "admin/admin-book";
    }

    @RequestMapping("bookType")
    public String redirectToBookType() {
        return "admin/admin-book-type";
    }


    @RequestMapping("user")
    public String redirectToUser() {
        return "admin/admin-user-info";
    }


    @RequestMapping("record")
    public String redirectToRecord() {
        return "admin/admin-record";
    }


    @RequestMapping("theme")
    public String redirectToTheme() {
        return "system/theme";
    }


    @RequestMapping("overview")
    public String redirectToOverview() {
        return "admin/admin-overview";
    }

}
