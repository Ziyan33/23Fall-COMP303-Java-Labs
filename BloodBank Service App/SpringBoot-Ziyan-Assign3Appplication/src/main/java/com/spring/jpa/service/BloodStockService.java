package com.spring.jpa.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.jpa.model.BloodStock;

@Service
public class BloodStockService {

    private final List<BloodStock> bloodStocks = new ArrayList<>();

    // Find all blood stocks
    public List<BloodStock> findAll() {
        return new ArrayList<>(bloodStocks);
    }

    public BloodStock findById(Integer id) {
        return bloodStocks.stream()
                 .filter(stock -> id != null && id.equals(stock.getId()))
                 .findFirst()
                 .orElse(null);
    }

    public BloodStock save(BloodStock bloodStock) {
        if (bloodStock.getId() == null) {
            // This is a new BloodStock, assign an ID
            bloodStock.setId(generateNewId());
            bloodStocks.add(bloodStock);
        } else {
            // Update existing BloodStock
            bloodStocks.removeIf(s -> s.getId().equals(bloodStock.getId()));
            bloodStocks.add(bloodStock);
        }
        return bloodStock;
    }

    private Integer generateNewId() {
        return bloodStocks.stream()
                          .mapToInt(BloodStock::getId)
                          .max()
                          .orElse(0) + 1;
    }


    public void delete(Integer id) {
        bloodStocks.removeIf(stock -> id != null && id.equals(stock.getId()));
   }
}