package com.example.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.pojo.Student;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * JavaBookManagementSystem
 *
 * @author PlutoCtx ctx195467@163.com
 * @version 2025/1/28 16:13
 * @since JDK17
 */

public interface StudentService extends IService<Student> {
    boolean login(String username, String password);

    @Select("select * from user")
    List<Student> findAll();
}
