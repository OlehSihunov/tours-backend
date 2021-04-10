package com.intentsg.service.tour.service;

import com.intentsg.service.tour.model.Tour;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import java.util.List;

public interface TourService {
    Tour getTourById(Long id);
    List<Tour> getAllTours();
    List<Tour> getUserTours(Long id);
    Tour saveTour(Tour tour);
    List<Tour> saveAllTours(List<Tour> tours);
    Page<Tour> getToursPage(Pageable pageable,Integer minPrice, Integer maxPrice);
    Integer getAmount();
}
