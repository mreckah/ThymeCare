package com.tp.ThymeCare.model;


import jakarta.persistence.*;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Entity
@Data @Getter @Setter @NoArgsConstructor
@AllArgsConstructor @Builder

public class Patient {
    @Id @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    private String name;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dateOfBirth;
    private String sick;
    private int score;
}
