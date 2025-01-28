package com.example.service.impl;

import cn.hutool.crypto.digest.DigestUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.mapper.StudentMapper;
import com.example.pojo.Student;
import com.example.service.StudentService;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * JavaBookManagementSystem
 *
 * @author PlutoCtx ctx195467@163.com
 * @version 2025/1/28 16:14
 * @since JDK17
 */

@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public boolean login(String username, String password) {

        QueryWrapper<Student> qw=new QueryWrapper<>();
        qw.eq("student_name",username);
        //qw.eq("password", DigestUtil.md5Hex(password));
        Student student = studentMapper.selectOne(qw);
        //if (student==null){
        //    return false;
        //}else {
        //    return true;
        //}

        return true;
    }

    @Override
    public List<Student> findAll() {
        //return List.of();
        return null;
    }

    //@Override
    //@Select("select * from user")
    //public List<Student> findAll() {
    //    return List.of();
    //}
}
