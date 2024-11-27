package com.peakprosys.demo.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.management.AttributeNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.peakprosys.demo.entity.User;
import com.peakprosys.demo.repository.UserRepository;

@RestController
@RequestMapping("/version1/")

//conect to angular
@CrossOrigin("*")
public class UserController {
	@Autowired
	private UserRepository userRepository;

	@PostMapping("insert")
	public User createUser(@RequestBody User user) {
		return userRepository.save(user);
	}

	@GetMapping("adminlist")
	public List<User> getAllUsers() {
		return userRepository.findAll();
	}

	@PutMapping("update/{id}")
	public ResponseEntity<User> updateUser(@PathVariable long id, @RequestBody User userDetail)
			throws AttributeNotFoundException {
		User user = userRepository.findById(id)
				.orElseThrow(() -> new AttributeNotFoundException("User id not found" + id));
		user.setUser(userDetail.getUser());
		user.setEmail(userDetail.getEmail());
		user.setMobile(userDetail.getMobile());
		user.setMsg(userDetail.getMsg());
		user.setCity(userDetail.getCity());

		User saveUser = userRepository.save(user);
		return ResponseEntity.ok(saveUser);
	}
	
	@GetMapping("{id}")
	public ResponseEntity<User> getByIdUser(@PathVariable long id)
			throws AttributeNotFoundException {
		User user = userRepository.findById(id)
				.orElseThrow(() -> new AttributeNotFoundException("User id not found" + id));
		
		return ResponseEntity.ok(user);
	}
   
	
	@DeleteMapping("delete/{id}")
	public ResponseEntity<Map<String,Boolean>> DeleteByIdUser(@PathVariable long id)
			throws AttributeNotFoundException {
		User user = userRepository.findById(id)
				.orElseThrow(() -> new AttributeNotFoundException("User id not found" + id));
		userRepository.delete(user);
		Map<String,Boolean> response=new HashMap<String,Boolean>();
		response.put("Deleted",true);
		return ResponseEntity.ok(response);
	}

}
