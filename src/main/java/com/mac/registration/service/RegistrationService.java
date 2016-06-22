package com.mac.registration.service;

import java.util.List;

import com.mac.registration.entity.User;

public interface RegistrationService {

    public User getUser(int userId);

    public void addUser(User user);

    public void updateUser(User user);

    public void removeUser(int userId);

    public List<User> listUsers();
}
