package com.intentsg.service.user;

import com.intentsg.service.user.controller.UserController;
import com.intentsg.service.user.model.User;
import com.intentsg.service.user.repository.UserRepository;
import com.intentsg.service.user.service.UserService;
import com.intentsg.service.user.service.UserServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = UserServiceApplication.class)
@WebAppConfiguration
public class UserServiceApplicationTest {
    
    @Autowired
    private UserController controller;
    
    @Autowired
    private User user;
    @Autowired
    private UserService userService;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserServiceImpl userServiceImpl;
    
    @Test
    public void main() {
        UserServiceApplication.main(new String[] {});
    }
    
    @Test
    public void contextLoadsUserController() {
        assertNotEquals(controller, null);
    }
    
    @Test
    public void contextLoadsUser() {
        assertNotEquals(user, null);
    }
    
    @Test
    public void contextLoadsUserService() {
        assertNotEquals(userService, null);
    }
    
    @Test
    public void contextLoadsUserRepository() {
        assertNotEquals(userRepository, null);
    }
    
    @Test
    public void contextLoadsUserServiceImpl() {
        assertNotEquals(userServiceImpl, null);
    }
}
