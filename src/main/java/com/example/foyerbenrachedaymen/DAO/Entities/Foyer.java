package com.example.foyerbenrachedaymen.DAO.Entities;

import jakarta.persistence.*;

@Entity
@Table
public class Foyer {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idFoyer;
    private String nomFoyer;
    private long capaciteFoyer;


}
