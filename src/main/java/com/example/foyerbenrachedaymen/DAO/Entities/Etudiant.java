package com.example.foyerbenrachedaymen.DAO.Entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.util.Set;

@Entity
@Table
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)

public class Etudiant {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idEtudiant;
    private String nomE;
    private String prenomE;
    private long cin;
    private String ecole;
    private LocalDate dateNaissance;
    @ManyToMany(mappedBy = "etudiants", cascade = CascadeType.ALL)
    private Set<Reservation> reservations;
}
