package com.intentsg.model;

public class UserOrder {
    private  Long id;
    private String title;
    private String description;
    private int price;
    private String imageUrl;
    private String userId;
    private int personCount;

    public UserOrder(Long id, String title, String description, int price, String imageUrl, String userId, int amount) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.price = price;
        this.imageUrl = imageUrl;
        this.userId = userId;
        this.personCount = amount;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public int getPersonCount() {
        return personCount;
    }

    public void setPersonCount(int amount) {
        this.personCount = amount;
    }
}
