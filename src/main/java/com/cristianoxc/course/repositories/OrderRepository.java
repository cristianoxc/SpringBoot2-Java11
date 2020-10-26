package com.cristianoxc.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cristianoxc.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
