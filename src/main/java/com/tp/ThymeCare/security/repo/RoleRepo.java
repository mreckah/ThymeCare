package com.tp.ThymeCare.security.repo;

import com.tp.ThymeCare.security.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepo extends JpaRepository<Role,String> {
}
