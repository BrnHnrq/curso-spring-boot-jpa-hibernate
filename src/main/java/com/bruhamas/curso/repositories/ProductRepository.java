package com.bruhamas.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bruhamas.curso.entities.Product;



public interface ProductRepository extends JpaRepository<Product, Long> {

}
