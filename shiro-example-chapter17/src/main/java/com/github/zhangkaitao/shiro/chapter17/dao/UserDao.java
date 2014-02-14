package com.github.zhangkaitao.shiro.chapter17.dao;

import com.github.zhangkaitao.shiro.chapter17.entity.User;

import java.util.List;
import java.util.Set;

/**
 * <p>User: Zhang Kaitao
 * <p>Date: 14-1-28
 * <p>Version: 1.0
 */
public interface UserDao {

    public User createUser(User user);
    public void updateUser(User user);
    public void deleteUser(Long userId);

    User findOne(Long userId);

    List<User> findAll();

    User findByUsername(String username);

}