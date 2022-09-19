package com.curriculum.application.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curriculum.application.dto.UserDTO;
import com.curriculum.application.entities.User;
import com.curriculum.application.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;

	public UserDTO findById(Long id) {
		User entity = repository.findById(id).get();
		UserDTO dto = new UserDTO(entity);
		return dto;
	}

	public List<UserDTO> findAll() {
		List<User> entities = repository.findAll();
		List<UserDTO> dtos = new ArrayList<>();

		for (int i = 0; i < entities.size(); i++) {
			dtos.add(new UserDTO(entities.get(i)));
		}

		return dtos;
	}

}
