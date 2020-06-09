package com.adq.cloud.admin.service;

import com.adq.cloud.admin.entities.User;
import com.baomidou.mybatisplus.core.metadata.IPage;

import java.util.List;
import java.util.Map;

public interface IUserService {

    List<User> selectAllOne();

    List<User> selectAllTwo();

    IPage<User> page();

    Map<String, Object> queryUser(String userId);
}
