package com.csii.ljj.mapper;

import com.csii.ljj.pojo.Users;

import java.util.List;

public interface UsersMapper {
    public List<Users> selectAll();
    public Users selectOne();
}
