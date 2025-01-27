package com.example.pojo;

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


    private Integer userId;
    private String username;
    private String password;
    private String email;
    private String phone;
    private String address;
    private String sex;
    private String age;
    private String major;
    private String college;
    private String simage;

}
