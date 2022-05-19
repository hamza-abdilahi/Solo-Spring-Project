package com.example.Solo.Spring.Project.controller;

import com.example.Solo.Spring.Project.model.players;
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
    public ResponseEntity<List<players>> members () {
        List<players> player = PlayersRepository.findAll();
        return ResponseEntity
                .ok()
                .body(player);
    }

    @PostMapping("/players")
    public ResponseEntity<players> createLab(@RequestBody players player) {
        players result = PlayersRepository.save(player);
        return ResponseEntity
                .ok()
                .body(result);
    }
    @GetMapping("/players/{names}")
    public ResponseEntity<players> getByTitle(@PathVariable String names) {
        players player = PlayersRepository.findByName(names);
        return ResponseEntity
                .ok()
                .body(player);
    }
}
