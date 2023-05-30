package com.devborges.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devborges.course.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResources {

	@GetMapping
	public ResponseEntity<User>findAll(){
		User u=new User(1L,"Thenilde","thenilde@hotmail.com","99999999", "123456");
		return  ResponseEntity.ok().body(u);
	}
}