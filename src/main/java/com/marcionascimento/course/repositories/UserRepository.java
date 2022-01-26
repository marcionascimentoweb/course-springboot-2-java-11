package com.marcionascimento.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marcionascimento.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	

}
