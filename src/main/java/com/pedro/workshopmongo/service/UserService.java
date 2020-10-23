package com.pedro.workshopmongo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pedro.workshopmongo.domain.User;
import com.pedro.workshopmongo.domain.repository.UserRespository;

@Service
public class UserService {
	@Autowired
	private UserRespository repo;

	public List<User> findAll() {
		return repo.findAll();

	}

}
