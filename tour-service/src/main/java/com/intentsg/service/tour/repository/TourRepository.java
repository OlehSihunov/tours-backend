package com.intentsg.service.tour.repository;

import com.intentsg.service.tour.model.Tour;
import com.intentsg.service.tour.model.UserTour;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TourRepository extends PagingAndSortingRepository<Tour,Long> {
    Page<Tour> findByPriceBetween(Integer minPrice, Integer maxPrice, Pageable pageable);
}
