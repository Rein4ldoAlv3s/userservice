package com.reinaldo.userservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.reinaldo.userservice.domain.User;

public interface UserRepo extends JpaRepository<User, Long>{

	User findByUsername(String username);
}
