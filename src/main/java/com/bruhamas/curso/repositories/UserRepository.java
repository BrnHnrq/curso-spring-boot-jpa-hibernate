package com.bruhamas.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bruhamas.curso.entities.User;



public interface UserRepository extends JpaRepository<User, Long> {

}
