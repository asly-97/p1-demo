package com.revature.p1demo.service;

import com.revature.p1demo.dao.UserDAO;
import com.revature.p1demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private UserDAO userDAO;

    @Autowired
    public UserService(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    public User registerUser(User newUser){

        //TODO: Exception Handling & Business Logic

        User user = userDAO.save(newUser);

        return user;
    }

    public List<User> getAllUsers(){
        return userDAO.findAll();
    }

}
