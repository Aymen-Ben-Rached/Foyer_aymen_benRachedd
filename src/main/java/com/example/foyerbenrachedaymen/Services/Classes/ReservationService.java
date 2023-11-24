package com.example.foyerbenrachedaymen.Services.Classes;

import com.example.foyerbenrachedaymen.DAO.Repositories.ReservationRepository;
import com.example.foyerbenrachedaymen.Services.Interfaces.IReservationService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ReservationService implements IReservationService {
    ReservationRepository reservationRepository;
}
