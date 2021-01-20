package com.eddie.mybatisplusmul.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.eddie.mybatisplusmul.annotation.DataSource;
import com.eddie.mybatisplusmul.enums.DataSourceEnum;
import lombok.Data;

/**
 * @Author: eddie
 * @Date: 2021/1/20 16:36
 **/
@Data
@TableName("message")
public class Message {
    
    @TableId(type = IdType.AUTO)
    private Integer id;
    
    private String title;
    
    private String content;
}
