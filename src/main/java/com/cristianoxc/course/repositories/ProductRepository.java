package com.cristianoxc.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cristianoxc.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
