package com.intentsg.service.user.service;

import com.intentsg.service.user.model.User;
import com.intentsg.service.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    
    @Autowired
    UserService userService;
    
    @Autowired
    UserRepository userRepository;
    
    @Override
    public void addUser(User user) throws ResponseStatusException {
        User authenticatedUser = userService.getAll()
                .stream()
                .filter(x -> x.getLogin().equals(user.getLogin()))
                .findFirst()
                .orElse(null);
        if (user != null && authenticatedUser == null) {
            user.setBalance(2000);
            userRepository.save(user);
        } else throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "User is already existed");
    }
    
    @Override
    public User getUserByLogin(User user) throws ResponseStatusException {
        User authenticatedUser = userService.getAll()
                .stream()
                .filter(x -> x.getLogin().equals(user.getLogin()) && x.getPassword().equals(user.getPassword()))
                .findFirst()
                .orElse(null);
        if (user != null && authenticatedUser != null) {
            return authenticatedUser;
        } else {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "User is not registered");
        }
    }
    
    @Override
    public User changeUserBalance(User user) {
        User authenticatedUser = userService.getAll()
                .stream()
                .filter(x -> x.getId().equals(user.getId()))
                .findFirst()
                .orElse(null);
        if (user != null && authenticatedUser != null && user.getBalance() >= 0) {
            authenticatedUser.setBalance(user.getBalance());
            userRepository.changeUserBalanceDB(authenticatedUser.getId(), authenticatedUser.getBalance());
            return userRepository.findById(authenticatedUser.getId()).get();
        } else {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "User does not have enough money");
        }
    }
    
    @Override
    public List<User> getAll() {
        return userRepository.findAll();
    }
}
