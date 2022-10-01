package com.test.service.Impl;

import com.test.pojo.User;
import com.test.service.UserService;
import com.test.util.DbHelper;

import java.util.List;
import java.util.Map;

public class UserServiceImpl implements UserService {
    @Override
    public List<Map<String,Object>> selUserInfoService() {
        String sql="select * from users";
        DbHelper dbHelper=new DbHelper();
        List<Map<String,Object>> list =  dbHelper.executeQuery(sql,null);
        return list;
    }
}
