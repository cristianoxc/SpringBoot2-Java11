package com.cristianoxc.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cristianoxc.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
