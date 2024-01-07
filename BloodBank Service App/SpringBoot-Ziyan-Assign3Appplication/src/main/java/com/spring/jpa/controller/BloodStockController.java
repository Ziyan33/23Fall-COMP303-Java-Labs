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

import com.spring.jpa.model.BloodStock;
import com.spring.jpa.service.BloodStockService;


@RestController
@RequestMapping("/bloodstock")
public class BloodStockController {

    @Autowired
    private BloodStockService bloodStockService;

    // Get all blood stocks
    @GetMapping
    public List<BloodStock> getAllBloodStocks() {
        return bloodStockService.findAll();
    }

    // Get a blood stock by ID
    @GetMapping("/{id}")
    public BloodStock getBloodStockById(@PathVariable Integer id) {
        return bloodStockService.findById(id);
    }

    // Create a new blood stock
    @PostMapping
    public BloodStock createBloodStock(@RequestBody BloodStock bloodStock) {
        return bloodStockService.save(bloodStock);
    }

    // Update a blood stock
    @PutMapping("/{id}")
    public BloodStock updateBloodStock(@PathVariable Integer id, @RequestBody BloodStock bloodStock) {
        bloodStock.setId(id);
        return bloodStockService.save(bloodStock);
    }

    // Delete a blood stock
    @DeleteMapping("/{id}")
    public void deleteBloodStock(@PathVariable Integer id) {
        bloodStockService.delete(id);
    }
}
