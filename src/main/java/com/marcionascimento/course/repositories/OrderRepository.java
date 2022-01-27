package com.marcionascimento.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marcionascimento.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	

}
