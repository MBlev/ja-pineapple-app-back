package com.example.japineappleapp.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.japineappleapp.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
	Optional<User> findByUsername(String username);
    Boolean existsByUsername(String username);
    
    @Query("SELECT c FROM user c WHERE c.email = ?1")
	Optional<User> findByEmail(String email);
}