package com.example.foyerbenrachedaymen.Services.Classes;

import com.example.foyerbenrachedaymen.DAO.Entities.Reservation;
import com.example.foyerbenrachedaymen.DAO.Repositories.ReservationRepository;
import com.example.foyerbenrachedaymen.Services.Interfaces.IReservationService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ReservationService implements IReservationService {
    ReservationRepository reservationRepository;

    @Override
    public Reservation addReservation(Reservation r) {
        return reservationRepository.save(r);
    }

    @Override
    public List<Reservation> addAllReservations(List<Reservation> reservations) {
        return reservationRepository.saveAll(reservations);
    }

    @Override
    public Reservation updateReservation(Reservation r) {
        return reservationRepository.save(r);
    }

    @Override
    public List<Reservation> findAllReservations() {
        return reservationRepository.findAll();
    }

    @Override
    public Reservation findReservationById(String id) {
        return reservationRepository.findById(id).get();
    }

    @Override
    public void deleteReservation(Reservation r) {
        reservationRepository.delete(r);
    }

    @Override
    public void deleteReservationById(String id) {
        reservationRepository.deleteById(id);
    }
}
