package com.intentsg.service.tour;

import com.intentsg.service.tour.controller.TourController;
import com.intentsg.service.tour.model.Tour;
import com.intentsg.service.tour.model.UserTour;
import com.intentsg.service.tour.repository.TourRepository;
import com.intentsg.service.tour.repository.UserTourRepository;
import com.intentsg.service.tour.service.TourService;
import com.intentsg.service.tour.service.TourServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = TourServiceApplication.class)
@WebAppConfiguration
public class TourServiceApplicationTest {
    
    @Autowired
    private TourController controller;
    @Autowired
    private Tour tour;
    @Autowired
    private UserTour userTour;
    @Autowired
    private TourService tourService;
    @Autowired
    private TourRepository tourRepository;
    @Autowired
    private UserTourRepository userTourRepository;
    @Autowired
    private TourServiceImpl tourServiceImpl;
    
    @Test
    public void main() {
        TourServiceApplication.main(new String[]{});
    }
    
    @Test
    public void contextLoadsTourController() {
        assertNotEquals(controller, null);
    }
    
    @Test
    public void contextLoadsTour() {
        assertNotEquals(tour, null);
    }
    
    @Test
    public void contextLoadsUserTour() {
        assertNotEquals(userTour, null);
    }
    
    @Test
    public void contextLoadsTourService() {
        assertNotEquals(tourService, null);
    }
    
    @Test
    public void contextLoadsTourRepository() {
        assertNotEquals(tourRepository, null);
    }
    
    @Test
    public void contextLoadsUserTourRepository() {
        assertNotEquals(userTourRepository, null);
    }
    
    @Test
    public void contextLoadsTourServiceImpl() {
        assertNotEquals(tourServiceImpl, null);
    }
}
