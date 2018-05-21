package com.mybatisDemo.mapper;

import com.mybatisDemo.modal.User;

public interface UserMapper {

    User queryById(Long id);
}
