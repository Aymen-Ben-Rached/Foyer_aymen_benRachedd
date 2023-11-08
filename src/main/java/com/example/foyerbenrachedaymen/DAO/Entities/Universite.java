package com.example.foyerbenrachedaymen.DAO.Entities;

import jakarta.persistence.*;

@Entity
@Table
public class Universite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idUniversite;
    private String nomUniverite;
    private String adresse;
}
