package com.example.controller;

import com.example.service.StudentService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * JavaBookManagementSystem
 *
 * @author PlutoCtx ctx195467@163.com
 * @version 2025/1/28 16:24
 * @since JDK17
 */

//@RestController
@Controller
//@RequestMapping("/admin")
//@RequestMapping
public class StudentController {

    //@Autowired
    //private StudentService studentService;

    @Value("${location}")
    private String location;



    @RequestMapping("listStudent")
    public String listStudent() {
        //return "admin/admin-overview";
        //return "admin/record";
        return "admin/admin-user-info";
    }


}
