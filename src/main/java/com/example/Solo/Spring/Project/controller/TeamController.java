package com.example.Solo.Spring.Project.controller;


import com.example.Solo.Spring.Project.model.Teams;
import com.example.Solo.Spring.Project.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("teams")
public class TeamController {

    @Autowired
    TeamRepository teamRepository;

    public TeamController(TeamRepository teamRepository){
        this.teamRepository = teamRepository;
    }

    @GetMapping(value =  "/{id}")
    public List<Teams> league() {
        List<Teams> teams = teamRepository.findAll();
        return teamRepository.findAll();
    }

    @PostMapping("/teams")
    public Teams leauge (@RequestBody Teams teams) {
        return teamRepository.save(teams);

    }

    @GetMapping("/teams")
    public ResponseEntity <Teams> getTeamById (Long id){
        Optional <Teams> teams = teamRepository.findById(id);
        return getTeamById(id);
    }


}
