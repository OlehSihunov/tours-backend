package com.intentsg.service.tour.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Entity
@Table(name = "user_tours")
@Component
@Scope("prototype")
public class UserTour {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "user_id")
    private String userId;

    @Column(name = "tour_id")
    private Long tourId;

    @Column(name = "amount")
    private int amount;
    
    public UserTour() {
    }
    
    public UserTour(Long id, String userId, Long tourId, int amount) {
        this.id = id;
        this.userId = userId;
        this.tourId = tourId;
        this.amount = amount;
    }
    
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Long getTourId() {
        return tourId;
    }

    public void setTourId(Long tourId) {
        this.tourId = tourId;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
