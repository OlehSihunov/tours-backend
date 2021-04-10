package com.intentsg.service.tour.service;

import com.intentsg.service.tour.model.Tour;
import com.intentsg.service.tour.model.UserTour;
import com.intentsg.service.tour.repository.TourRepository;
import com.intentsg.service.tour.repository.UserTourRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class TourServiceImpl implements TourService{
    @Autowired
    private TourRepository tourRepository;

    @Autowired
    private UserTourRepository userTourRepository;
    @Override
    public Tour getTourById(Long id) {
        return tourRepository.findById(id).get();
    }

    @Override
    public List<Tour> getAllTours() {
        return (List<Tour>) tourRepository.findAll();
    }

    @Override
    public List<Tour> getUserTours(Long id) {
        return (List<Tour>) tourRepository.findAll();
    }

    @Override
    public Page<Tour> getToursPage(Pageable pageable,Integer minPrice,Integer maxPrice) {

        return tourRepository.findByPriceBetween(minPrice,maxPrice,pageable);
    }


    @Override
    public List<UserTour> getUserTours(String userId) {
        return userTourRepository.findAllByUserId(userId);
    }

    @Override
    public UserTour saveNewUserTour(UserTour userTour) {
        return userTourRepository.save(userTour);
    }
}
