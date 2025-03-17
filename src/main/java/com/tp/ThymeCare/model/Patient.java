package com.tp.ThymeCare.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Table(name="patients")
@Data @Getter @Setter @NoArgsConstructor @AllArgsConstructor @ToString
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private Date date;
    private boolean sick;
    private int score;
    
}
