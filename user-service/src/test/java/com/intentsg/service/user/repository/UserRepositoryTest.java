package com.intentsg.service.user.repository;

import com.intentsg.service.user.model.User;
import com.intentsg.service.user.service.UserService;
import org.junit.After;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
@Transactional
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class UserRepositoryTest {
    
    @Autowired
    private UserRepository subject;
    
    @After
    public void tearDown() throws Exception {
        subject.deleteAll();
    }

    @Test
    public void changeUserBalanceDBTest() throws Exception {
        User peter = new User("bodya","111","41", 1000);
        subject.save(peter);
        subject.changeUserBalanceDB("41",100);
        User changedPeter = subject.getOne("41");
        assertEquals(changedPeter.getBalance(), 100);
    }
}