package com.marcionascimento.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marcionascimento.course.entities.User;
import com.marcionascimento.course.repositories.UserRepository;
import com.marcionascimento.course.services.exceptions.ResourceNotFoundException;

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
		return obj.orElseThrow(() -> new ResourceNotFoundException(id));
	}
	
	//Salvar
	public User insert(User obj) {
		return repository.save(obj);
	}
	
	//Deletar
	public void delete(Long id) {
		repository.deleteById(id);
		
	}
	
	// Atualizar
	public User update(Long id, User obj) {
		User entity = repository.getOne(id);
		updateData(entity, obj);
		return repository.save(entity);
	}

	private void updateData(User entity, User obj) {
		entity.setName(obj.getName());
		entity.setEmail(obj.getEmail());
		entity.setPhone(obj.getPhone());
	}
	
}
