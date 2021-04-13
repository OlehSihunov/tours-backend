package com.intentsg.service.user.controller;

import com.intentsg.service.user.model.User;
import com.intentsg.service.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/users")
public class UserController {
    
    @Autowired
    UserService userService;
    
    @PostMapping("/signUp")
    public ResponseEntity<User> signup(@RequestBody User user) {
        userService.addUser(user);
        return new ResponseEntity<>(userService.getUserByLogin(user), HttpStatus.OK);
    }
    
    @PostMapping("/signIn")
    public ResponseEntity<User> signin(@RequestBody User user) {
        return new ResponseEntity<>(userService.getUserByLogin(user), HttpStatus.OK);
    }
    
    @GetMapping("/getAll")
    public ResponseEntity<List<User>> getAll() {
        return new ResponseEntity<>(userService.getAll(), HttpStatus.OK);
    }
    
    @PostMapping("/changeBalance")
    public ResponseEntity<?> changeBalance(@RequestBody User user) {
        if (user.getBalance() >= 0) {
            return ResponseEntity.ok(userService.changeUserBalance(user));
        } else {
            return ResponseEntity.badRequest().body("User does not have enough money");
        }
    }
}
