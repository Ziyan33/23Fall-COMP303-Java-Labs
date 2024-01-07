package com.spring.boot.micro.controller;

import com.spring.boot.micro.model.Reservation;
import com.spring.boot.micro.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@RestController
@RequestMapping("/api/reservations")
public class ReservationController {

    private final ReservationService reservationService;

    @Autowired
    public ReservationController(ReservationService reservationService) {
        this.reservationService = reservationService;
    }

    // Get all reservations
    @GetMapping
    public ResponseEntity<List<Reservation>> getAllReservations() {
        List<Reservation> reservations = reservationService.findAllReservations();
        return ResponseEntity.ok(reservations);
    }

    // Get a reservation by id
    @GetMapping("/{id}")
    public ResponseEntity<Reservation> getReservationById(@PathVariable String id) {
        return reservationService.findReservationById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // Create a new reservation
	/*
	 * @PostMapping public ResponseEntity<Reservation>
	 * createReservation(@RequestBody Reservation reservation) { Reservation
	 * newReservation = reservationService.createReservation(reservation); return
	 * ResponseEntity.ok(newReservation); }
	 */
 // Create a new reservation
    @PostMapping
    public String createReservation(@RequestBody Reservation reservation, RedirectAttributes redirectAttributes) {
        Reservation newReservation = reservationService.createReservation(reservation);
        redirectAttributes.addFlashAttribute("reservation", newReservation);
        return "redirect:/result";
    }

  
}