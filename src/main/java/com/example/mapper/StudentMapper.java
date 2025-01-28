package com.example.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.pojo.Student;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * JavaBookManagementSystem
 *
 * @author PlutoCtx ctx195467@163.com
 * @version 2025/1/28 16:10
 * @since JDK17
 */

@Repository
public interface StudentMapper extends BaseMapper<Student> {

    @Select("select * from user")
    List<Student> findAll();
}
