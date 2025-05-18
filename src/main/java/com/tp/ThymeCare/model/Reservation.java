package com.tp.ThymeCare.model;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.stereotype.Controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "reservations")
@Controller
@Data @NoArgsConstructor @AllArgsConstructor
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "date_reservation", nullable = false)
    private LocalDateTime dateReservation;
    @Enumerated(EnumType.STRING)
    @Column(name = "type_reservation", nullable = false)
    private TypeReservation typeReservation;
    @Column(name = "duree", nullable = false)
    private Integer duree; // en minutes
    @Column(name = "cout", nullable = false)
    private Double cout;
    @Enumerated(EnumType.STRING)
    @Column(name = "etat", nullable = false)
    private EtatReservation etat;

}

