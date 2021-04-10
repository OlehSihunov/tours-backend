package com.intentsg.service.tour.controller;


import com.intentsg.service.tour.service.TourService;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(controllers = TourController.class)
public class TourControllerTest {
    @MockBean
    private TourService tourService;

    @Autowired
    private MockMvc mockMvc;

    @Test
    public  void  whenGetAllTours_returnStatus200() throws  Exception {
        mockMvc.perform(get("/tours/")).andDo(print()).andExpect(status().isOk());
    }

    @Test
    public  void whenGetTourById_returrnStatus200() throws  Exception {
        mockMvc.perform(get("/tours/1")).andDo(print()).andExpect(status().isOk());
    }
    @Test
    public  void whenGetToursPage_returrnStatus200() throws  Exception {
        mockMvc.perform(get("/tours/getPage?minPrice=200&maxPrice=1000&page=0&size=10&sort=price,desc")).andDo(print()).andExpect(status().isOk());
    }

    @Test
    public  void whenGetUserTours_returrnStatus200() throws  Exception {
        mockMvc.perform(get("/tours/users/u1")).andDo(print()).andExpect(status().isOk());
    }
    @Test
    public  void whenSaveNewUserTour_returrnStatus201() throws  Exception {
        mockMvc.perform( post( "/tours/users/addNew" )
                .content( "{\"id\": 5,\"userId\": \"USER_ID\",\"tour_id\": 4,\"amount\": 2}" )
                .contentType( MediaType.APPLICATION_JSON ))
                .andDo( print() ).andExpect( status().isCreated() );
    }
}
