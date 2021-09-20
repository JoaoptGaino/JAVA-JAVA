package com.br.springjwtcourse.springjwtcourse.user.services;

import com.br.springjwtcourse.springjwtcourse.role.Role;
import com.br.springjwtcourse.springjwtcourse.user.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);
    Role saveRole(Role role);

    void addRoleToUser(String username, String roleName);
    User getUser(String username);
    List<User>getUsers();
}
