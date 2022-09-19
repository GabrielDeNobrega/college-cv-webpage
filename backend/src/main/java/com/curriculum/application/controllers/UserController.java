package com.curriculum.application.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curriculum.application.dto.UserDTO;
import com.curriculum.application.services.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserController {

	@Autowired
	private UserService service;

	@GetMapping(value = "/{id}")
	public UserDTO findById(@PathVariable Long id) {
		return service.findById(id);
	}

	@GetMapping(value = "/all")
	public List<UserDTO> findAll() {
		return service.findAll();
	}

}
