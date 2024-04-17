package com.lsu.dashboard.auth.service;

public interface UserService {
    User save(UserDto user);
    List<User> findAll();
    User findOne(String username);
}
public interface RoleService {
    Role findByName(String name);
}