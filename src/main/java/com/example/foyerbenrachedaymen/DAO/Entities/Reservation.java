package com.example.foyerbenrachedaymen.DAO.Entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idReservation;
    private LocalDate anneeUniversitaire;
    private boolean estValide;

}
