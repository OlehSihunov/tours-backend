package com.intentsg.service.tour.repository;

import com.intentsg.service.tour.model.Tour;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
@Transactional
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class TourRepositoryTest {
    
    @Autowired
    TourRepository tourRepository;
    @MockBean
    Pageable pageable;

    @Test
    void findByPriceBetween() {
        Tour tour = new Tour(2L, "title1", "description1", 100, "imgUrl");
        tourRepository.save(tour);
        Tour tour3 = new Tour(3L, "title3", "description3", 900, "imgUrl");
        tourRepository.save(tour3);
        Tour tour4 = new Tour(4L, "title4", "description4", 2000, "imgUrl");
        tourRepository.save(tour4);
        List<Tour> tours = new ArrayList<>();
        Page<Tour> pagedTours = new PageImpl(tours);
        //Mockito.when(this.tourRepository.findAll(pagedTours)).thenReturn(pagedTours);
        Page<Tour> returnTour = tourRepository.findByPriceBetween(90, 1000, pageable);
    }
}
