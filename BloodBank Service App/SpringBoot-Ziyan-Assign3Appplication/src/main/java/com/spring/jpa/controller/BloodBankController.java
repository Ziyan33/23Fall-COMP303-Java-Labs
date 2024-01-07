package com.spring.jpa.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.jpa.model.BloodBank;
import com.spring.jpa.service.BloodBankService;

@RestController
@RequestMapping("/bloodbank")
public class BloodBankController {

    @Autowired
    private BloodBankService bloodBankService;

    // Get all blood banks
    @GetMapping
    public List<BloodBank> getAllBloodBanks() {
        return bloodBankService.findAll();
    }

    // Get a blood bank by ID
    @GetMapping("/{id}")
    public BloodBank getBloodBankById(@PathVariable Integer id) {
        return bloodBankService.findById(id);
    }

    // Create a new blood bank
    @PostMapping
    public BloodBank createBloodBank(@RequestBody BloodBank bloodBank) {
        return bloodBankService.save(bloodBank);
    }

    // Update a blood bank
    @PutMapping("/{id}")
    public BloodBank updateBloodBank(@PathVariable Integer id, @RequestBody BloodBank bloodBank) {
        bloodBank.setId(id);
        return bloodBankService.save(bloodBank);
    }

    // Delete a blood bank
    @DeleteMapping("/{id}")
    public void deleteBloodBank(@PathVariable Integer id) {
        bloodBankService.delete(id);
    }
}