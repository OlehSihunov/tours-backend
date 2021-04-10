package com.intentsg.service.tour.controller;

import com.intentsg.service.tour.model.Tour;
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
	TourService tourService;
	@GetMapping("/test")
	public ResponseEntity test() {
		return ResponseEntity.ok("tours-service");
	}


	@GetMapping("/")
	public  ResponseEntity<List<Tour>> getAllTours() {
		System.out.println("Hello");
		return  new ResponseEntity<List<Tour>>(tourService.getAllTours(), HttpStatus.OK);
	}

	@GetMapping("/{tourId}")
	public ResponseEntity<Tour> getTourById(@PathVariable("tourId") Long id) {
		return  new ResponseEntity<Tour>(tourService.getTourById(id),HttpStatus.OK);
	}
	@PostMapping("/addTour")
	public ResponseEntity<Tour> saveNewTour(@RequestBody Tour tour) {
		return new ResponseEntity<Tour>(tourService.saveTour(tour),HttpStatus.OK);
	}
	@PostMapping("/addTours")
	public ResponseEntity<List<Tour>> saveAllTours(@RequestBody List<Tour> tours) {
		return  new ResponseEntity<List<Tour>>(tourService.saveAllTours(tours),HttpStatus.OK);
	}
	@GetMapping("/getPage")
	public ResponseEntity<Page<Tour>> getToursPage(@RequestParam Integer maxPrice, @RequestParam Integer minPrice,Pageable pageable) {

		System.out.println(pageable);
		return  new ResponseEntity<Page<Tour>>(tourService.getToursPage(pageable,minPrice,maxPrice),HttpStatus.OK);
	}
	@GetMapping("/getAmount")
	public ResponseEntity<Integer> getAmount(){
		return new ResponseEntity<Integer>(tourService.getAmount(),HttpStatus.OK);
	}

}
