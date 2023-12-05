package com.example.foyerbenrachedaymen.DAO.Entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity
@Table
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)

public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String idReservation;
    private LocalDate anneeUniversitaire;
    private boolean estValide;
    @ManyToMany(mappedBy = "reservations", cascade = CascadeType.ALL)
    List<Etudiant> etudiants = new ArrayList<>();
}
