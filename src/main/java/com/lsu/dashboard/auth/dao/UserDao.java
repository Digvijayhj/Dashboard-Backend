package com.lsu.dashboard.auth.dao;

@Repository
public interface UserDao extends CrudRepository<User, Long> {
    User findByUsername(String username);
}
@Repository
public interface RoleDao extends CrudRepository<Role, Long> {
    Role findRoleByName(String name);
}