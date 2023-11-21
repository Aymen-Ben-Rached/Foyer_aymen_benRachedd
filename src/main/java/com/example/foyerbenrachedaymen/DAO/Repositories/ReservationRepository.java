package com.example.foyerbenrachedaymen.DAO.Repositories;

import com.example.foyerbenrachedaymen.DAO.Entities.Chambre;
import com.example.foyerbenrachedaymen.DAO.Entities.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation, String> {

}
