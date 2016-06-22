package com.mac.registration.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.mac.registration.entity.User;

@Repository
public class UserDAOImpl implements UserDAO {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserDAOImpl.class);

    private SessionFactory sessionFactory;

    public User getUser(int userId) {
        return (User) sessionFactory.getCurrentSession().load(User.class, userId);
    }

    public void addUser(User user) {
        sessionFactory.getCurrentSession().persist(user);
    }

    public void updateUser(User user) {
        sessionFactory.getCurrentSession().update(user);
    }

    public void removeUser(int userId) {
        sessionFactory.getCurrentSession().delete(getUser(userId));
    }

    @SuppressWarnings("unchecked")
    public List<User> listUsers() {
        return sessionFactory.getCurrentSession().createQuery("from User").list();
    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

}
