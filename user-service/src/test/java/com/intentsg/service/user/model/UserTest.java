package com.intentsg.service.user.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    
    @Test
    void getLogin() {
        System.out.println("getLogin");
        User instance = new User();
        String expResult = "login";
        instance.setLogin("login");
        String result = instance.getLogin();
        assertEquals(expResult, result);
    }
    
    @Test
    void setLogin() {
        System.out.println("setLogin");
        String login = "login";
        User instance = new User();
        instance.setLogin("login");
        assertEquals(instance.getLogin(), login);
    }
    
    @Test
    void getPassword() {
        System.out.println("getPassword");
        User instance = new User();
        String expResult = "Password";
        instance.setPassword("Password");
        String result = instance.getPassword();
        assertEquals(expResult, result);
    }
    
    @Test
    void setPassword() {
        System.out.println("setPassword");
        String password = "password";
        User instance = new User();
        instance.setPassword("password");
        assertEquals(instance.getPassword(), password);
    }
    
    @Test
    void getId() {
        System.out.println("getId");
        User instance = new User();
        String expResult = "Id";
        instance.setId("Id");
        String result = instance.getId();
        assertEquals(expResult, result);
    }
    
    @Test
    void setId() {
        System.out.println("setId");
        String Id = "Id";
        User instance = new User();
        instance.setId("Id");
        assertEquals(instance.getId(), Id);
    }
    
    @Test
    void getBalance() {
        System.out.println("getBalance");
        User instance = new User();
        int expResult = 1000;
        instance.setBalance(1000);
        int result = instance.getBalance();
        assertEquals(expResult, result);
    }
    
    @Test
    void setBalance() {
        System.out.println("setBalance");
        int balance = 2000;
        User instance = new User();
        instance.setBalance(2000);
        assertEquals(instance.getBalance(), balance);
    }
}