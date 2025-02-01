package com.example.controller;

import com.example.service.StudentService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
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

@RestController
@RequestMapping("/admin")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @Value("${location")
    private String location;


    @RequestMapping("/listStudent")
    public String listStudent(@RequestParam(defaultValue = "1", value = "pageNum", required = false)Integer pageNum,
                              @RequestParam(defaultValue = "10", value = "pageSize", required = false)Integer pageSize,
                              Model model) {

        if (pageNum < 0 || pageNum.equals("") || pageNum == null){
            pageNum = 1;
        }
        if (pageSize < 0 || pageSize.equals("") || pageSize == null){
            pageSize = 6;
        }
        PageHelper.startPage(pageNum, pageSize);

        return "admin/admin-student-list";
    }
}
