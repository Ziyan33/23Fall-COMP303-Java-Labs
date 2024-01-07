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

import com.spring.jpa.model.Seeker;
import com.spring.jpa.service.SeekerService;

@RestController
@RequestMapping("/seeker")
public class SeekerController {

    @Autowired
    private SeekerService seekerService;

    // Get all seekers
    @GetMapping
    public List<Seeker> getAllSeekers() {
        return seekerService.findAll();
    }

    // Get a seeker by ID
    @GetMapping("/{id}")
    public Seeker getSeekerById(@PathVariable Integer id) {
        return seekerService.findById(id);
    }

    // Create a new seeker
    @PostMapping
    public Seeker createSeeker(@RequestBody Seeker seeker) {
        return seekerService.save(seeker);
    }

    // Update a seeker
    @PutMapping("/{id}")
    public Seeker updateSeeker(@PathVariable Integer id, @RequestBody Seeker seeker) {
        seeker.setId(id);
        return seekerService.save(seeker);
    }

    // Delete a seeker
    @DeleteMapping("/{id}")
    public void deleteSeeker(@PathVariable Integer id) {
        seekerService.delete(id);
    }
}