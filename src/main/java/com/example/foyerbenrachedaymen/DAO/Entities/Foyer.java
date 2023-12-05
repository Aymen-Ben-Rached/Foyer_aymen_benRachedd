package com.example.foyerbenrachedaymen.DAO.Entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

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

public class Foyer {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idFoyer;
    private String nomFoyer;
    private long capaciteFoyer;
    @OneToOne(mappedBy = "foyer")
    Universite universite;
    @OneToMany(mappedBy = "foyer") //a verifier Unidirectionnelle ou Bidirectionnelle
    List<Bloc> blocs = new ArrayList<>();

}
