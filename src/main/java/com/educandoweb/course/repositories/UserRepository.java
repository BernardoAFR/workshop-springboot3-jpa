package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entites.User;

//jparepository já compoe o spring
public interface UserRepository extends JpaRepository<User, Long> {

	
	
}
