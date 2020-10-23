package com.cristianoxc.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cristianoxc.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
