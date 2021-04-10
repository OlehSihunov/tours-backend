package com.intentsg.service.tour.repository;

import com.intentsg.service.tour.model.Tour;
import com.intentsg.service.tour.model.UserTour;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserTourRepository extends JpaRepository<UserTour,Long> {
    List<UserTour> findAllByUserId(String userId);
    List<UserTour> findAllByAmount(Integer userId);
}


