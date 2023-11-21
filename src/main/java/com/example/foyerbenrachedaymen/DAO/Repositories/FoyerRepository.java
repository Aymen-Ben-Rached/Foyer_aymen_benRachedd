package com.example.foyerbenrachedaymen.DAO.Repositories;

import com.example.foyerbenrachedaymen.DAO.Entities.Chambre;
import com.example.foyerbenrachedaymen.DAO.Entities.Foyer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoyerRepository extends JpaRepository<Foyer, Long> {
}
