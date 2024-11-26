package com.peakprosys.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.peakprosys.demo.entity.User;
import com.peakprosys.demo.repository.UserRepository;

@RestController
@RequestMapping("/version1/")
public class UserController {
	@Autowired
	private UserRepository userRepository;
	@PostMapping("insert")
	public User createUser(@RequestBody User user) {
		return userRepository.save(user);
	}

}
