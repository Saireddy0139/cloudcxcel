package com.example.cloudxcel.repository;

import com.example.cloudxcel.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
