package com.intentsg.service.tour.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/tours")
public class TourController {

	@GetMapping("/test")
	public ResponseEntity test() {
		return ResponseEntity.ok("tours-service");
	}
}
