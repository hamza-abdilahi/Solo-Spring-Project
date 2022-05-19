package com.example.Solo.Spring.Project.controller;


import com.example.Solo.Spring.Project.model.Teams;
import com.example.Solo.Spring.Project.repository.TeamRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class TeamController {

    private final TeamRepository teamRepository;

    public TeamController(TeamRepository teamRepository){
        this.teamRepository = teamRepository;
    }

    @GetMapping("/teams")
    public ResponseEntity<List<Teams>> league() {

        List<Teams> teams = teamRepository.findAll();
        return ResponseEntity
                .ok()
                .body(teams);
    }

    @PostMapping("/teams")
    public ResponseEntity<Teams> leauge (@RequestBody Teams teams) {
        Teams result = teamRepository.save(teams);
        return ResponseEntity
                .ok()
                .body(result);
    }

    @GetMapping("/teams")
    public ResponseEntity<List<Teams>> league (@RequestParam(required = false, defaultValue = "false")
                                                            boolean orderedByLastName) {
        List<Teams> teams;
        if (orderedByLastName) {
            teams = teamRepository.findAllOrdered();
        } else {
            teams = teamRepository.findAll();
        }
        return ResponseEntity
                .ok()
                .body(teams);
    }
}
