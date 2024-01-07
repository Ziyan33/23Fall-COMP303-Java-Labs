package com.spring.boot.micro.controller;


import com.spring.boot.micro.model.Reservation;
import com.spring.boot.micro.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;

@Controller
public class WebController {

    private final ReservationService reservationService;

    @Autowired
    public WebController(ReservationService reservationService) {
        this.reservationService = reservationService;
    }

    // Mapping for the main reservation form page
    @GetMapping("/")
    public String reservationForm(Model model) {
        model.addAttribute("reservation", new Reservation());
        return "reservation"; // returns the reservation.html template
    }

    // Mapping to handle the form submission and redirect to the results page
    @PostMapping("/reserve")
    public ModelAndView createReservation(@ModelAttribute Reservation reservation) {
        Reservation savedReservation = reservationService.createReservation(reservation);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("reservation", savedReservation);
        modelAndView.setViewName("redirect:/result"); // Redirect to the result page
        return modelAndView;
    }

    // Mapping for the results page, displaying the reservation just made
    @GetMapping("/result")
    public String showResult(@ModelAttribute("reservation") Reservation reservation, Model model) {
        // Assuming that the reservation object is already added to the model via redirect attributes
        return "result"; // returns the result.html template
    }

    // If you need to display a list of reservations on the results page
    @GetMapping("/results")
    public String showResultsList(Model model) {
        List<Reservation> reservations = reservationService.findAllReservations();
        model.addAttribute("reservations", reservations);
        return "result"; // returns the result.html template with a list of reservations
    }
}