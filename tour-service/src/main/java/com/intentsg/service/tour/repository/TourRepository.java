package com.intentsg.service.tour.repository;

import com.intentsg.service.tour.model.Tour;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TourRepository extends PagingAndSortingRepository<Tour,Long> {
    @Query("from Tour t where t.id>(:page-1)*:size and t.id<=:page*:size")
    List<Tour> getPage(@Param("page") int page, @Param("size") int size);

    @Query("select count(*) from Tour ")
    Integer getAmount();
    Page<Tour> findByPriceBetween(Integer minPrice, Integer maxPrice, Pageable pageable);
}
