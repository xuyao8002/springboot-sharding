package com.xuyao.springboot.service.impl;


import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xuyao.springboot.bean.po.User;
import com.xuyao.springboot.dao.UserMapper;
import com.xuyao.springboot.service.IUserService;
import org.springframework.stereotype.Service;


@Service
@DS("ds1")
public class User1ServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
