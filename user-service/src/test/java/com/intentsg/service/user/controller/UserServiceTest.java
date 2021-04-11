package com.intentsg.service.user.controller;


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
public class UserServiceTest {
    @MockBean
    private UserController userController;
    
    @Autowired
    private MockMvc mockMvc;
    
    @Test
    public  void  whenGetAllUsers_returnStatus200() throws  Exception {
        mockMvc.perform(get("/users/getAll")).andDo(print()).andExpect(status().isOk());
    }
    @Test
    public  void  whenPostSignup_returnStatus200() throws  Exception {
        mockMvc.perform(post("/users/signup")
                .content( "{\"id\": \"5\",\"login\": \"USER_Login\",\"password\": \"111\"}" )
                .contentType( MediaType.APPLICATION_JSON )).andDo(print()).andExpect(status().isOk());
    }
    @Test
    public  void  whenPostSignin_returnStatus200() throws  Exception {
        mockMvc.perform(post("/users/signin")
                .content( "{\"id\": \"5\",\"login\": \"USER_Login\",\"password\": \"111\"}" )
                .contentType( MediaType.APPLICATION_JSON )).andDo(print()).andExpect(status().isOk());
    }
    @Test
    public  void  whenPostChangeBalance_returnStatus200() throws  Exception {
        mockMvc.perform(post("/users/changeBalance")
                .content( "{\"id\": \"5\",\"login\": \"USER_Login\",\"password\": \"111\",\"balance\": 1000}" )
                .contentType( MediaType.APPLICATION_JSON )).andDo(print()).andExpect(status().isOk());
    }
    @Test
    public  void  whenPostChangeBalance_returnStatus404() throws  Exception {
        mockMvc.perform(post("/users/changeBalance")
                .content( "{\"id\": \"5\",\"login\": \"USER_Login\",\"password\": \"111\",\"balance\": -100}" )
                .contentType( MediaType.APPLICATION_JSON )).andDo(print()).andExpect(status().isBadRequest());
    }
}
