package com.justchating.server.repository;

import com.justchating.server.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface  UserRepository extends JpaRepository<User, String> {
    @Query("SELECT u FROM User u WHERE u.name = ?1")
    User findByName(String username);
}
