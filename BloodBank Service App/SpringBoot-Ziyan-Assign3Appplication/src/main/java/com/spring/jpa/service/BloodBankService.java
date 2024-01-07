package com.spring.jpa.service;

import java.util.List;

import com.spring.jpa.model.BloodBank;
import java.util.ArrayList;


import org.springframework.stereotype.Service;

@Service
public class BloodBankService {

    private final List<BloodBank> bloodBanks = new ArrayList<>();

    // Find all blood banks
    public List<BloodBank> findAll() {
        return new ArrayList<>(bloodBanks);
    }

    // Find a blood bank by ID
    public BloodBank findById(Integer id) {
        return bloodBanks.stream()
        		.filter(bank -> id != null && id.equals(bank.getId()))
                .findFirst()
                .orElse(null);
    }

    // Save a blood bank
    public BloodBank save(BloodBank bloodBank) {
        if (bloodBank.getId() != null) {
            bloodBanks.removeIf(b -> b.getId().equals(bloodBank.getId()));
        } else {
            // Assign a new ID for a new BloodBank
            bloodBank.setId(generateNewId());
        }
        bloodBanks.add(bloodBank);
        return bloodBank;
    }

    private Integer generateNewId() {
        return bloodBanks.stream()
                         .mapToInt(BloodBank::getId)
                         .max()
                         .orElse(0) + 1;
    }

    // Delete a blood bank
    public void delete(Integer id) {
        bloodBanks.removeIf(bank -> id != null && id.equals(bank.getId()));
    }
}
