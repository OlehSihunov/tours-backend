package com.intentsg.service.user.controller;

import com.intentsg.service.user.model.User;
import com.intentsg.service.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	UserService userService;
	
	@PostMapping("/signup")
	public ResponseEntity<User> signup(@RequestBody User user) {
		userService.addUser(user);
		return new ResponseEntity<>(userService.getUserByLogin(user), HttpStatus.OK);
	}
	@PostMapping("/signin")
	public ResponseEntity<User> signin(@RequestBody User user) {
		userService.getUserByLogin(user);
		return new ResponseEntity<>(userService.getUserByLogin(user), HttpStatus.OK);
	}
	@GetMapping("/getAll")
	public ResponseEntity<List<User>> getAll(){
		return new ResponseEntity<>(userService.getAll(), HttpStatus.OK);
	}
	@PostMapping("/changeBalance")
	public ResponseEntity<?> changeBalans(@RequestBody User user) {
		userService.changeUserBalance(user);
		return ResponseEntity.ok(HttpStatus.ACCEPTED);
	}
	@PostMapping("/balance")
	public ResponseEntity<Integer> balance(@RequestBody User user){
		return new ResponseEntity<>(userService.getUserBalance(user), HttpStatus.OK);
	}
	//hello
}
