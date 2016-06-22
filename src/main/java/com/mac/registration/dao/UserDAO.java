package com.mac.registration.dao;

import java.util.List;

import com.mac.registration.entity.User;

public interface UserDAO {

    public User getUser(int userId);

    public void addUser(User user);

    public void updateUser(User user);

    public void removeUser(int userId);

    public List<User> listUsers();

}
