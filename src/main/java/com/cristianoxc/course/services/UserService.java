package com.cristianoxc.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cristianoxc.course.entities.User;
import com.cristianoxc.course.repositories.UserRepository;
import com.cristianoxc.course.services.exceptions.ResourceNotFoundException;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	public List<User> findAll(){
		return repository.findAll();
	}
	
	public User findById(Long id){
		Optional<User> obj = repository.findById(id);
		return obj.orElseThrow(()-> new ResourceNotFoundException(id));
	}

	public User insert(User obj) {
		return repository.save(obj);
	}
	
	public void delete(Long id) {
		repository.deleteById(id);
	}
	
	public User update(Long id, User obj) {
		// o getOne instancia o usuario sem ir no DB, vai deixar somente o objeto 
		// monitorado no JPA para trabalhar com ele e em seguida efetuar alguma operação com DB.
		// É diferente do findById que vai no DB e traz o objeto.
		User entity = repository.getOne(id);
		updateData(entity, obj);
		return repository.save(entity);
	}
	
	private void updateData(User entity, User obj) {
		entity.setname(obj.getname());
		entity.setEmail(obj.getEmail());
		entity.setPhone(obj.getPhone());
	}
}
