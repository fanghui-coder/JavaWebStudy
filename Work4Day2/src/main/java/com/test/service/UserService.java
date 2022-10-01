package com.test.service;

import com.test.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserService {
    //查询所有的用户信息
    List<Map<String,Object>> selUserInfoService();

}
