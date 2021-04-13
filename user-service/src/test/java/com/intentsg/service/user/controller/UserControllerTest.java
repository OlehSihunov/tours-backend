package com.intentsg.service.user.controller;


import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.http.MediaType;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(controllers = UserController.class)
public class UserControllerTest {
    
    @MockBean
    private UserController userController;
    
    @Autowired
    private ObjectMapper objectMapper;
    
    @Autowired
    private MockMvc mockMvc;
    
    @Test
    public void whenGetAllUsers_returnStatus200() throws Exception {
        mockMvc.perform(get("/users/getAll")).andDo(print()).andExpect(status().isOk());
    }
    
    @Test
    public void whenPostSignUp_returnStatus200() throws Exception {
        mockMvc.perform(post("/users/signUp")
                .content("{\"id\": \"44\",\"login\": \"bodya3\",\"password\": \"111\"}")
                .contentType(MediaType.APPLICATION_JSON)).andDo(print()).andExpect(status().isOk());
    }
    
    @Test
    public void whenPostSignIn_returnStatus200() throws Exception {
        mockMvc.perform(post("/users/getUser")
                .content("{\"id\": \"5\",\"login\": \"USER_Login\",\"password\": \"111\"}")
                .contentType(MediaType.APPLICATION_JSON)).andDo(print()).andExpect(status().isOk());
    }
    
    @Test
    public void whenPostChangeBalance_returnStatus200() throws Exception {
        mockMvc.perform(post("/users/changeBalance")
                .content("{\"id\": \"5\",\"login\": \"USER_Login\",\"password\": \"111\",\"balance\": 1000}")
                .contentType(MediaType.APPLICATION_JSON)).andDo(print()).andExpect(status().isOk());
    }
    
    @Test
    public void whenPostChangeBalanceWithoutBalance_returnStatus400() throws Exception {
        mockMvc.perform(post("/users/changeBalance")
                .content("{\"id\": \"5\",\"login\": \"USER_Login\",\"password\": \"111\"")
                .contentType(MediaType.APPLICATION_JSON)).andDo(print()).andExpect(status().isBadRequest());
    }
    @Test
    public void whenPostChangeBalanceWithMinusBalance_returnStatus400() throws Exception {
        mockMvc.perform(post("/users/changeBalance")
                .content("{\"id\": \"5\",\"login\": \"USER_Login\",\"password\": \"111\",\"balance\": (-100)}")
                .contentType(MediaType.APPLICATION_JSON)).andDo(print()).andExpect(status().isBadRequest());
    }
}
