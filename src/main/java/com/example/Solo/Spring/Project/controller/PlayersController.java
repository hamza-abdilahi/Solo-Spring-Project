package com.example.Solo.Spring.Project.controller;

import com.example.Solo.Spring.Project.model.Players;
import com.example.Solo.Spring.Project.repository.PlayersRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public class PlayersController {

    private final PlayersRepository playersRepository;

    public PlayersController(PlayersRepository playersRepository) {
        this.playersRepository = playersRepository;
    }

    @GetMapping("/players")
    public ResponseEntity<List<Players>> getAllMembers () {
        List<Players> player = playersRepository.findAll();
        return ResponseEntity
                .ok()
                .body(player);
    }

    @PostMapping("/players")
    public ResponseEntity<Players> members (@RequestBody Players player) {
        Players members = playersRepository.save(player);
        return ResponseEntity
                .ok()
                .body(members);
    }
    @GetMapping("/players/{names}")
    public ResponseEntity<Players> getByName(@PathVariable String firstName) {
        Players player = playersRepository.findByFirstName(firstName);
        return ResponseEntity
                .ok()
                .body(player);
    }
}
