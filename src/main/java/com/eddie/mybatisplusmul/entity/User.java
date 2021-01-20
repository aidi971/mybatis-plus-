package com.eddie.mybatisplusmul.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;

/**
 * @Author: eddie
 * @Date: 2021/1/20 16:36
 **/
@Data
@TableName("user")
public class User {
    @TableId
    private Integer id;
    
    private String name;
    
    private Integer age;
}
