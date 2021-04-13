package com.intentsg.service.tour.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TourTest {
    
    @Test
    void getId() {
        System.out.println(100L);
        Tour instance = new Tour();
        Long expResult = 100L;
        instance.setId(100L);
        Long result = instance.getId();
        assertEquals(expResult, result);
    }
    
    @Test
    void setId() {
        System.out.println(100L);
        Long Id = 100L;
        Tour instance = new Tour();
        instance.setId(100L);
        assertEquals(instance.getId(), Id);
    }
    
    @Test
    void getTitle() {
        System.out.println("getTitle");
        Tour instance = new Tour();
        String expResult = "Title";
        instance.setTitle("Title");
        String result = instance.getTitle();
        assertEquals(expResult, result);
    }
    
    @Test
    void setTitle() {
        System.out.println("setTitle");
        String title = "Title";
        Tour instance = new Tour();
        instance.setTitle("Title");
        assertEquals(instance.getTitle(), title);
    }
    
    @Test
    void getDescription() {
        System.out.println("getDescription");
        Tour instance = new Tour();
        String expResult = "Description";
        instance.setDescription("Description");
        String result = instance.getDescription();
        assertEquals(expResult, result);
    }
    
    @Test
    void setDescription() {
        System.out.println("setDescription");
        String description = "Description";
        Tour instance = new Tour();
        instance.setDescription("Description");
        assertEquals(instance.getDescription(), description);
    }
    
    @Test
    void getPrice() {
        System.out.println(100);
        Tour instance = new Tour();
        int expResult = 100;
        instance.setPrice(100);
        int result = instance.getPrice();
        assertEquals(expResult, result);
    }
    
    @Test
    void setPrice() {
        System.out.println(100);
        int price = 100;
        Tour instance = new Tour();
        instance.setPrice(100);
        assertEquals(instance.getPrice(), price);
    }
    
    @Test
    void getImageUrl() {
        System.out.println("getImageUrl");
        Tour instance = new Tour();
        String expResult = "url";
        instance.setImageUrl("url");
        String result = instance.getImageUrl();
        assertEquals(expResult, result);
    }
    
    @Test
    void setImageUrl() {
        System.out.println("setImageUrl");
        String url = "url";
        Tour instance = new Tour();
        instance.setImageUrl("url");
        assertEquals(instance.getImageUrl(), url);
    }
    
    @Test
    void User() {
        Tour tour = new Tour(2L, "title", "description", 100, "imgUrl");
        assertEquals(tour.getId(), 2L);
        assertEquals(tour.getTitle(), "title");
        assertEquals(tour.getDescription(), "description");
        assertEquals(tour.getPrice(), 100);
        assertEquals(tour.getImageUrl(), "imgUrl");
    }
}