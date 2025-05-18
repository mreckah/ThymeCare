package com.tp.ThymeCare.repository;

import com.tp.ThymeCare.model.EtatReservation;
import com.tp.ThymeCare.model.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Long> {
    List<Reservation> findByEtat(EtatReservation etat);

    List<Reservation> findByDateReservationBetween(LocalDateTime start, LocalDateTime end);
}