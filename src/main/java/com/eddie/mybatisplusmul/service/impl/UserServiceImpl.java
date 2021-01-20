package com.eddie.mybatisplusmul.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.eddie.mybatisplusmul.entity.User;
import com.eddie.mybatisplusmul.mapper.UserMapper;
import com.eddie.mybatisplusmul.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @Author: eddie
 * @Date: 2021/1/20 16:41
 **/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
