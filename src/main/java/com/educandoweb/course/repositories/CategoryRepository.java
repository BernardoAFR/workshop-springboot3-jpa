package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entites.Category;

//jparepository já compoe o spring
public interface CategoryRepository extends JpaRepository<Category, Long> {

	
	
}
