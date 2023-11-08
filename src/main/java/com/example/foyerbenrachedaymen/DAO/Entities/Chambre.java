package com.example.foyerbenrachedaymen.DAO.Entities;

import jakarta.persistence.*;

@Entity
@Table
public class Chambre{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idChambre;
    private long numeroChambre;
    private TypeChambre typeC;
}
