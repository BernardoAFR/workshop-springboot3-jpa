package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entites.Order;

//jparepository já compoe o spring
public interface OrderRepository extends JpaRepository<Order, Long> {

	
	
}
