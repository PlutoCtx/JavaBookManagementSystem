package com.example.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * JavaBookManagementSystem
 * 学生
 *
 * @author PlutoCtx ctx195467@163.com
 * @version 2025/1/28 9:34
 * @since JDK17
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("student")
public class Student {

    // 学号
    @TableId("student_id")
    //@TableField("student_id")
    private String studentId;

    // 学生姓名
    @TableField("student_name")
    private String studentName;

    // 年龄
    //@TableField("age")
    private Integer age;

    // 性别
    //@TableField("sex")
    private String sex;

    // 学院
    //@TableField("college")
    private String college;

    // 专业
    //@TableField("major")
    private String major;

    // 班级名
    //@TableField("classname")
    private String classname;

}
