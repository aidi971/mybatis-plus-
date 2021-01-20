package com.eddie.mybatisplusmul.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.eddie.mybatisplusmul.annotation.DataSource;
import com.eddie.mybatisplusmul.entity.Message;
import com.eddie.mybatisplusmul.enums.DataSourceEnum;
import com.eddie.mybatisplusmul.mapper.MessageMapper;
import com.eddie.mybatisplusmul.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: eddie
 * @Date: 2021/1/20 16:41
 **/
@Service
public class MessageServiceImpl extends ServiceImpl<MessageMapper, Message> implements MessageService {
   
    @DataSource(DataSourceEnum.DB2)
    public Message findMessage(String id){
        return super.selectById(id);
    }
}
