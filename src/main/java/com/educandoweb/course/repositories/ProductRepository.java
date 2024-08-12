package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entites.Product;

//jparepository já compoe o spring
public interface ProductRepository extends JpaRepository<Product, Long> {

	
	
}
