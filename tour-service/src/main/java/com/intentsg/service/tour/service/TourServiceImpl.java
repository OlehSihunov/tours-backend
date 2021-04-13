package com.intentsg.service.tour.service;

import com.intentsg.model.UserOrder;
import com.intentsg.service.tour.model.Tour;
import com.intentsg.service.tour.model.UserTour;
import com.intentsg.service.tour.repository.TourRepository;
import com.intentsg.service.tour.repository.UserTourRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;


@Component
public class TourServiceImpl implements TourService{
    @Autowired
    private TourRepository tourRepository;

    @Autowired
    private UserTourRepository userTourRepository;
    @Override
    public Tour getTourById(Long id) {
        Tour responce = tourRepository.findById(id).get();
        if(responce!=null){
            return responce;
        }else {
            throw new NoSuchElementException("No your with such id");
        }
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
    public List<UserOrder> getUserTours(String userId) {
        List<UserTour> ut =  userTourRepository.findAllByUserId(userId);
        List<UserOrder> uo = new ArrayList<>();
        for (UserTour el: ut) {
            Tour temp = getTourById(el.getTourId());
            uo.add(new UserOrder(
                    temp.getId(),
                    temp.getTitle(),
                    temp.getDescription(),
                    temp.getPrice(),
                    temp.getImageUrl(),
                    el.getUserId(),
                    el.getAmount()
            ));
        }
        return uo;
    }

    @Override
    public UserTour saveNewUserTour(UserTour userTour) {
        return userTourRepository.save(userTour);
    }
}
