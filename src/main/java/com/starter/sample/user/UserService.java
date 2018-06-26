package com.starter.sample.user;

import java.util.List;

public interface UserService {

    public List<User> selectAllUsers();
    public int insertUser(User user);
    public int updateUser(User user);
    public int deleteUser(User user);

}
