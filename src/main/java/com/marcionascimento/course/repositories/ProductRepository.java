package com.marcionascimento.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marcionascimento.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
