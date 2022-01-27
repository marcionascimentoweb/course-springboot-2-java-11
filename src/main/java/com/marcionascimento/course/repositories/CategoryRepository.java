package com.marcionascimento.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marcionascimento.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
