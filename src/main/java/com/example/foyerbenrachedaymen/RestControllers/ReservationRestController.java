package com.example.foyerbenrachedaymen.RestControllers;

import com.example.foyerbenrachedaymen.DAO.Entities.Reservation;
import com.example.foyerbenrachedaymen.Services.Interfaces.IReservationService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class ReservationRestController {
    IReservationService iReservationService;

    @GetMapping("getAllReservations")
    public List<Reservation> getAllReservations() {
        return iReservationService.findAllReservations();
    }

    @GetMapping("getReservationById")
    public Reservation getReservationById(@RequestParam String id) {
        return iReservationService.findReservationById(id);
    }

    @PostMapping("addReservation")
    public Reservation addReservation(@RequestBody Reservation reservation) {
        return iReservationService.addReservation(reservation);
    }

    @PostMapping("addAllReservation")
    public List<Reservation> addAllChambres(@RequestBody List<Reservation> reservations) {
        return iReservationService.addAllReservations(reservations);
    }
}
