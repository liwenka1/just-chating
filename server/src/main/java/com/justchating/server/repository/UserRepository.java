package com.justchating.server.repository;

import com.justchating.server.entity.User;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface  UserRepository extends JpaRepository<User, String> {
    User findByName(String name);
}
