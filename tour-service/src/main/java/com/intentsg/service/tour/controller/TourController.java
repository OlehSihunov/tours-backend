package com.intentsg.service.tour.controller;

import com.intentsg.model.UserOrder;
import com.intentsg.service.tour.model.Tour;
import com.intentsg.service.tour.model.UserTour;
import com.intentsg.service.tour.service.TourService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import org.springframework.data.domain.Pageable;
import java.util.List;

@CrossOrigin
@Controller
@RequestMapping("/tours")
public class TourController {
    @Autowired
	private  TourService tourService;



	@GetMapping("/")
	public  ResponseEntity<List<Tour>> getAllTours() {
		System.out.println("Hello");
		return  new ResponseEntity<>(tourService.getAllTours(), HttpStatus.OK);
	}

	@GetMapping("/{tourId}")
	public ResponseEntity<Tour> getTourById(@PathVariable("tourId") Long id) {
		return  new ResponseEntity<>(tourService.getTourById(id),HttpStatus.OK);
	}
	@GetMapping("/getPage")
	public ResponseEntity<Page<Tour>> getToursPage(@RequestParam(required = false, defaultValue = "10000") Integer maxPrice, @RequestParam(required = false, defaultValue = "0") Integer minPrice,Pageable pageable) {

		System.out.println(pageable);
		return  new ResponseEntity<>(tourService.getToursPage(pageable,minPrice,maxPrice),HttpStatus.OK);
	}

    @GetMapping("/users/{userId}")
	public ResponseEntity<List<UserOrder>> getUserTours(@PathVariable("userId") String userId) {

		return  new ResponseEntity<>(tourService.getUserTours(userId),HttpStatus.OK);
	}
	@PostMapping("/users/addNew")
	public ResponseEntity<UserTour> saveNewUserTour(@RequestBody UserTour userTour) {
		return  new ResponseEntity<>(tourService.saveNewUserTour(userTour),HttpStatus.CREATED);
	}

}
