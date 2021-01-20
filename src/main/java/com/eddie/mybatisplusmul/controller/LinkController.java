package com.eddie.mybatisplusmul.controller;

import com.eddie.mybatisplusmul.entity.Message;
import com.eddie.mybatisplusmul.entity.User;
import com.eddie.mybatisplusmul.response.Response;
import com.eddie.mybatisplusmul.service.MessageService;
import com.eddie.mybatisplusmul.service.UserService;
import com.eddie.mybatisplusmul.service.impl.MessageServiceImpl;
import com.eddie.mybatisplusmul.service.impl.UserServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: eddie
 * @Date: 2021/1/20 16:45
 **/
@Slf4j
@RestController
public class LinkController {
    
    @Autowired
    private UserServiceImpl userService;
    @Autowired
    private MessageServiceImpl messageService;
    
    @PostMapping("/mul")
    public Response change(){
        User user = userService.selectById("123456");
        Message message = messageService.findMessage("123456");
        
        Object result = user.getName()+"说了"+message.getContent();
        log.info("多数据源",result.toString());
        return new Response(200,"success",result);
    }
}
