package com.intentsg.service.tour.service;

import com.intentsg.service.tour.model.Tour;
import com.intentsg.service.tour.model.UserTour;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import java.util.List;

public interface TourService {
    Tour getTourById(Long id);
    List<Tour> getAllTours();
    Page<Tour> getToursPage(Pageable pageable,Integer minPrice, Integer maxPrice);
    List<UserTour> getUserTours(String userId);
    UserTour saveNewUserTour(UserTour userTour);


}
