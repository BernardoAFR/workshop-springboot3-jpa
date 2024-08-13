package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entites.OrderItem;
import com.educandoweb.course.entites.pk.OrderItemPK;

//jparepository já compoe o spring
public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
