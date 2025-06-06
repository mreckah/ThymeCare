package com.tp.ThymeCare.security.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class User {
    @Id
    private String id;
    @Column(unique=true)
    private String username;
    private String password;
    private String email;
    @ManyToMany(fetch = FetchType.LAZY)
    private List<Role> roles;
}
