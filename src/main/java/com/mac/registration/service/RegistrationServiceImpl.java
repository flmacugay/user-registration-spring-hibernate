package com.mac.registration.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mac.registration.dao.UserDAO;
import com.mac.registration.entity.User;

@Service
@Qualifier("RegistrationService")
public class RegistrationServiceImpl implements RegistrationService {

    private UserDAO userDAO;

    @Transactional
    public User getUser(int userId) {
        return userDAO.getUser(userId);
    }

    @Transactional
    public void addUser(User user) {
        userDAO.addUser(user);
    }

    @Transactional
    public void updateUser(User user) {
        userDAO.updateUser(user);
    }

    @Transactional
    public void removeUser(int userId) {
        userDAO.removeUser(userId);
    }

    @Transactional
    public List<User> listUsers() {
        return userDAO.listUsers();
    }

    public UserDAO getUserDAO() {
        return userDAO;
    }

    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

}
