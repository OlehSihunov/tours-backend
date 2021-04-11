package com.intentsg.service.user.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users")
@Component
@Scope("prototype")
public class User {
    
    @Column(name="id")
    @Id
    private String id;
    @Column(name="login")
    private String login;
    @Column(name="password")
    private String password;
    @Column(name="balance")
    private int balance;
    
    public User() {
    }
    
    public User(String login, String password, String id, int balance) {
        this.login = login;
        this.password = password;
        this.id = id;
        this.balance = balance;
    }
    
    public String getLogin() {
        return login;
    }
    
    public void setLogin(String login) {
        this.login = login;
    }
    
    public String getPassword() {
        return password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getId() {
        return id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    public int getBalance() {
        return balance;
    }
    
    public void setBalance(int balance) {
        this.balance = balance;
    }
}
