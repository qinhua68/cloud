package com.adq.cloud.admin.service.impl;

import com.adq.cloud.admin.config.DBConstants;
import com.adq.cloud.admin.entities.User;
import com.adq.cloud.admin.mapper.UserMapper;
import com.adq.cloud.admin.service.IUserService;
import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @DS(DBConstants.DATASOURCE_MASTER)
    @Override
    public List<User> selectAllOne() {
        User user = new User();
        user.setUserName("zhansan");
        Wrapper<User> wrapper = new QueryWrapper<>(user);
        return userMapper.selectList(wrapper);
    }

    @DS(DBConstants.DATASOURCE_CLUSTER)
    @Override
    public List<User> selectAllTwo() {
        User user = new User();
        user.setUserName("zhansan");
        Wrapper<User> wrapper = new QueryWrapper<>(user);
        return userMapper.selectList(wrapper);
    }

    @Override
    public IPage<User> page(){
        int currentPage = 1 ; //当前页
        int pageSize = 10 ;//每页大小
        IPage<User> page = new Page(currentPage,pageSize);
        page = userMapper.selectPage(page,null);
        return page;
    }

    @DS(DBConstants.DATASOURCE_MASTER)
    @Override
    public Map<String, Object> queryUser(String userId) {
        return userMapper.queryUser(userId);
    }
}
