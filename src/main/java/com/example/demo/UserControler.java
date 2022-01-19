package com.example.demo;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;

@RestController
public class UserControler {
	@GetMapping("/user")
	String getuser() {
		System.out.println("testing");
		return "testing";
	}

	@PostMapping("/user")
	void creatUser(@RequestBody User user) {

		System.out.println(user.getName());

	}

	@DeleteMapping("/user")
	void deleteUser() {
		// ToDo Auto - generated method stub
	}
//adding new line\
	//add
}