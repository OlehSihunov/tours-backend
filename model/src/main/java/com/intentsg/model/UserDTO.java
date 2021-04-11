package com.intentsg.model;


public class UserDTO {
    

    private String id;
    private String login;
    private String password;
    private int balance;
    
    public UserDTO() {
    }
    
    public UserDTO(String login, String password, String id, int balance) {
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
