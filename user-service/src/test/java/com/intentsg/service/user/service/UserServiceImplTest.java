package com.intentsg.service.user.service;


import com.intentsg.service.user.model.User;
import com.intentsg.service.user.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.core.AutoConfigureCache;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
@AutoConfigureCache
@Transactional
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class UserServiceImplTest {
    
    @MockBean
    private UserService userService;
    
    @Autowired
    private UserRepository subject;
    
    @PersistenceContext
    EntityManager entityManager;
    
    @Test
    void addUser() {
        User peter = new User("bodya", "111", "41", 1000);
        userService.addUser(peter);
        User testPeter = subject.getOne("41");
        assertEquals(testPeter.getLogin(), peter.getLogin());
    }
    
    @Test
    void getUserByLogin() {
        User peter = new User("bodya", "111", "41", 1000);
        subject.save(peter);
        userService.getUserByLogin(peter);
        User testPeter = subject.getOne("41");
        assertEquals(testPeter.getLogin(), peter.getLogin());
    }
    
    @Test
    void changeUserBalance() {
        User peter = new User("bodya", "111", "41", 1000);
        subject.save(peter);
        User changedBalancePeter = new User("bodya", "111", "41", 100);
        userService.changeUserBalance(changedBalancePeter);
        entityManager.clear();
        User resultPeter = subject.getOne("41");
        assertEquals(resultPeter.getBalance(), 100);
    }
}