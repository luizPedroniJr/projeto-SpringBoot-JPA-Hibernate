package com.example.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.course.entities.Users;


public interface UsersRepository  extends JpaRepository<Users, Long>{

}
