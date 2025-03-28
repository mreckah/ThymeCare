package com.tp.ThymeCare.security.repo;

import com.tp.ThymeCare.security.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,String> {
    User findByUsername(String username);
}
