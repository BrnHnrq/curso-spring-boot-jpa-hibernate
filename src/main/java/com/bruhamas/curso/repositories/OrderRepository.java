package com.bruhamas.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bruhamas.curso.entities.Order;



public interface OrderRepository extends JpaRepository<Order, Long> {

}
