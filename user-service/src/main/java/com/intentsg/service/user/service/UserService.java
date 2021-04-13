package com.intentsg.service.user.service;

import com.intentsg.service.user.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
     void addUser(User user);
    
     User getUserByLogin(User user);
    
     User changeUserBalance(User user);
    
     List<User> getAll();
}
