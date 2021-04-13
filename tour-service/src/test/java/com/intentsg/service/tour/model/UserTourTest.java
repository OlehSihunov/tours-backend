package com.intentsg.service.tour.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTourTest {
    
    @Test
    void getUserId() {
        System.out.println("getUserId");
        UserTour instance = new UserTour();
        String expResult = "UserId";
        instance.setUserId("UserId");
        String result = instance.getUserId();
        assertEquals(expResult, result);
    }
    
    @Test
    void setUserId() {
        System.out.println("setUserId");
        String title = "UserId";
        UserTour instance = new UserTour();
        instance.setUserId("UserId");
        assertEquals(instance.getUserId(), title);
    }
    
    @Test
    void getTourId() {
        System.out.println(100L);
        UserTour instance = new UserTour();
        Long expResult = 100L;
        instance.setTourId(100L);
        Long result = instance.getTourId();
        assertEquals(expResult, result);
    }
    
    @Test
    void setTourId() {
        System.out.println(100L);
        Long Id = 100L;
        UserTour instance = new UserTour();
        instance.setId(100L);
        assertEquals(instance.getId(), Id);
    }
    
    @Test
    void getAmount() {
        System.out.println(100);
        UserTour instance = new UserTour();
        int expResult = 100;
        instance.setAmount(100);
        int result = instance.getAmount();
        assertEquals(expResult, result);
    }
    
    @Test
    void setAmount() {
        System.out.println(100);
        int price = 100;
        UserTour instance = new UserTour();
        instance.setAmount(100);
        assertEquals(instance.getAmount(), price);
    }
    
    @Test
    void getId() {
        System.out.println(100L);
        UserTour instance = new UserTour();
        Long expResult = 100L;
        instance.setId(100L);
        Long result = instance.getId();
        assertEquals(expResult, result);
    }
    
    @Test
    void setId() {
        System.out.println(100L);
        Long Id = 100L;
        UserTour instance = new UserTour();
        instance.setId(100L);
        assertEquals(instance.getId(), Id);
    }
    
    @Test
    void UserTour() {
        UserTour tour = new UserTour(2L, "userId", 10L, 10);
        assertEquals(tour.getId(), 2L);
        assertEquals(tour.getUserId(), "userId");
        assertEquals(tour.getTourId(), 10L);
        assertEquals(tour.getAmount(), 10);
    }
}