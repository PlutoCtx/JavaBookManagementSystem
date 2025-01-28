package com.example.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * JavaBookManagementSystem
 * 用户
 *
 * @author PlutoCtx ctx195467@163.com
 * @version 2025/1/27 14:53
 * @since JDK17
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("user")
public class User {

    // 用户ID
    @TableField("user_id")
    private Integer userId;

    // 学号
    @TableField("student_id")
    private String studentId;

    // 用户名
    @TableField("nickname")
    private String nickname;

    // 密码
    @TableField("password")
    private String password;

    // 邮箱
    @TableField("email")
    private String email;

    // 手机
    @TableField("phone")
    private String phone;

    // 头像
    @TableField("user_avatar")
    private String userAvatar;

}
