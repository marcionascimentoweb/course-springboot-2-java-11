package com.marcionascimento.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marcionascimento.course.entities.User;
import com.marcionascimento.course.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;
	
	//Listar todos
	public List<User> findAll() {
		return repository.findAll();
	}
	
	//Listar por Id
	public User findById(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.get();
	}
	
	//Salvar
	public User insert(User obj) {
		return repository.save(obj);
	}
	
	
}
