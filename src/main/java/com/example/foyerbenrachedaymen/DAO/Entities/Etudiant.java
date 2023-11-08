package com.example.foyerbenrachedaymen.DAO.Entities;

import jakarta.persistence.*;

import java.time.LocalDate;
@Entity
@Table(name="Etudiant")
public class Etudiant {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idEtudiant;
    private String nomE;
    private String prenomE;
    private long cin;
    private String ecole;
    private LocalDate dateNaissance;
}
