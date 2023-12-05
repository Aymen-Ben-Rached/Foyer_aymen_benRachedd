package com.example.foyerbenrachedaymen.DAO.Entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
@ToString
public class Chambre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long idChambre;
    long numeroChambre;
    @Enumerated(EnumType.STRING)
    TypeChambre typeC;
    @ManyToOne
    Bloc bloc;
    @OneToMany(cascade = CascadeType.ALL)
    List<Reservation> reservations = new ArrayList<>();
}
