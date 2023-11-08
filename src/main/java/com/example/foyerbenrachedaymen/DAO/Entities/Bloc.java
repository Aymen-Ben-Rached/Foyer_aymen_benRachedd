package com.example.foyerbenrachedaymen.DAO.Entities;

import jakarta.persistence.*;

@Table
@Entity
public class Bloc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idBloc;
    private String nomBloc;
    private long capaciteBloc;
}
