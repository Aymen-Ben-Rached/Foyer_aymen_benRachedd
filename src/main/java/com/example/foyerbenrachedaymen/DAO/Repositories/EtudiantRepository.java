package com.example.foyerbenrachedaymen.DAO.Repositories;

import com.example.foyerbenrachedaymen.DAO.Entities.Chambre;
import com.example.foyerbenrachedaymen.DAO.Entities.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EtudiantRepository extends JpaRepository<Etudiant, Long> {
}
