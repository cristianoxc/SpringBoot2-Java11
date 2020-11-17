package com.cristianoxc.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cristianoxc.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
