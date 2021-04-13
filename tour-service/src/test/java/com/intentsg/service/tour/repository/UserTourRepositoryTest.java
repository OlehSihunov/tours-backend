package com.intentsg.service.tour.repository;

import com.intentsg.service.tour.model.UserTour;
import com.intentsg.service.tour.service.TourService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
@Transactional
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class UserTourRepositoryTest {
    
    @Autowired
    UserTourRepository userTourRepository;
    
    @Test
    void findAllByUserId() {
        List<UserTour> testUserTour = new ArrayList<>();
        UserTour ut1 = new UserTour(1L, "userid1", 100L, 10);
        UserTour ut2 = new UserTour(2L, "userid2", 101L, 10);
        UserTour ut3 = new UserTour(3L, "userid2", 102L, 10);
        testUserTour.add(ut1);
        testUserTour.add(ut2);
        testUserTour.add(ut3);
        userTourRepository.saveAll(testUserTour);
        List<UserTour> fromDbUserTour = userTourRepository.findAllByUserId("userid2");
        assertEquals(fromDbUserTour.size(), 2);
    }
}