package com.intentsg.service.user.service;

import com.intentsg.service.user.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    public void addUser(User user);
    public User getUserByLogin(User user);
    public int getUserBalance(User user);
    public void changeUserBalance(User user);
    public List<User> getAll();
}
