package com.spring.jpa.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.jpa.model.Seeker;

@Service
public class SeekerService {

    private final List<Seeker> seekers = new ArrayList<>();

    // Find all seekers
    public List<Seeker> findAll() {
        return new ArrayList<>(seekers);
    }

    // Find a seeker by ID
    public Seeker findById(Integer id) {
        return seekers.stream()
        		.filter(seeker -> id != null && id.equals(seeker.getId()))
                .findFirst()
                .orElse(null);
    }

    // Save a seeker
    public Seeker save(Seeker seeker) {
        if(seeker.getId()!=null) {
        	seekers.removeIf(s -> seeker.getId().equals(s.getId()));
        }else {
        	seeker.setId(generateNewId());
        }
        seekers.add(seeker);
        return seeker;
    }
    private Integer generateNewId() {
        return seekers.stream()
                      .mapToInt(Seeker::getId)
                      .max()
                      .orElse(0) + 1;
    }
    // Delete a seeker
    public void delete(Integer id) {
        seekers.removeIf(seeker -> seeker.getId().equals(id));
    }
}