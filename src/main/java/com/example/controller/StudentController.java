package com.example.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.mapper.StudentMapper;
import com.example.pojo.Student;
import com.example.service.StudentService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * JavaBookManagementSystem
 *
 * @author PlutoCtx ctx195467@163.com
 * @version 2025/1/28 16:24
 * @since JDK17
 */

@Controller
@RequestMapping("/admin")
//@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @Autowired
    private StudentMapper studentMapper;


    @Value("${location")
    private String location;


    @RequestMapping("/listStudent")
    //public String listStudent(Model model, Student student) {
    public String listStudent(Model model) {

        //QueryWrapper<Student> queryWrapper = new QueryWrapper<>();
        //if (student.getStudentName() != null) {
        //    queryWrapper.like("student_name", student.getStudentName());
        //}
        //queryWrapper.like("student_name", "");
        //List<Student> list = studentService.list(queryWrapper);
        List<Student> list = studentMapper.findAll();
        System.out.println(list.size());
        Student temp = list.get(0);
        System.out.println(temp);
        System.out.println(list);

        Student tmp = new Student(
                "2020",
                "student1",
                18,
                "男",
                "计院",
                "计科",
                "1班"
        );
        list.add(tmp);
        System.out.println(list.size());
        //System.out.println(list.get(0).toString());

        //list.forEach(System.out::println);

        PageInfo<Student> pageInfo = new PageInfo<>(list);
        model.addAttribute("pageInfo", pageInfo);

        return "admin/admin-user-info";
    }










}
