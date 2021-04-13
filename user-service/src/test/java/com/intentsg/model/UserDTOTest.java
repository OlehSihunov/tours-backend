package com.intentsg.model;

import com.intentsg.service.user.model.User;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserDTOTest {
    
    @Test
    void getLogin() {
        System.out.println("getLogin");
        UserDTO instance = new UserDTO();
        String expResult = "login";
        instance.setLogin("login");
        String result = instance.getLogin();
        assertEquals(expResult, result);
    }
    
    @Test
    void setLogin() {
        System.out.println("setLogin");
        String login = "login";
        UserDTO instance = new UserDTO();
        instance.setLogin("login");
        assertEquals(instance.getLogin(), login);
    }
    
    @Test
    void getPassword() {
        System.out.println("getPassword");
        UserDTO instance = new UserDTO();
        String expResult = "Password";
        instance.setPassword("Password");
        String result = instance.getPassword();
        assertEquals(expResult, result);
    }
    
    @Test
    void setPassword() {
        System.out.println("setPassword");
        String password = "password";
        UserDTO instance = new UserDTO();
        instance.setPassword("password");
        assertEquals(instance.getPassword(), password);
    }
    
    @Test
    void getId() {
        System.out.println("getId");
        UserDTO instance = new UserDTO();
        String expResult = "Id";
        instance.setId("Id");
        String result = instance.getId();
        assertEquals(expResult, result);
    }
    
    @Test
    void setId() {
        System.out.println("setId");
        String Id = "Id";
        UserDTO instance = new UserDTO();
        instance.setId("Id");
        assertEquals(instance.getId(), Id);
    }
    
    @Test
    void getBalance() {
        System.out.println("getBalance");
        UserDTO instance = new UserDTO();
        int expResult = 1000;
        instance.setBalance(1000);
        int result = instance.getBalance();
        assertEquals(expResult, result);
    }
    
    @Test
    void setBalance() {
        System.out.println("setBalance");
        int balance = 2000;
        UserDTO instance = new UserDTO();
        instance.setBalance(2000);
        assertEquals(instance.getBalance(), balance);
    }
    @Test
    public void UserDTO() {
        UserDTO peter = new UserDTO("bodya", "111", "41", 1000);
        assertEquals(peter.getLogin(), "bodya");
        assertEquals(peter.getPassword(), "111");
        assertEquals(peter.getId(), "41");
        assertEquals(peter.getBalance(), 1000);
    }
}