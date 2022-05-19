package com.example.Solo.Spring.Project.controller;

import com.example.Solo.Spring.Project.model.Players;
import com.example.Solo.Spring.Project.model.Teams;
import com.example.Solo.Spring.Project.repository.PlayersRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

public class PlayersController {

    private final PlayersRepository playersRepository;

    public PlayersController(PlayersRepository playersRepository) {
        this.playersRepository = playersRepository;
    }

    @GetMapping("/teams")
    public List<Players> members() {
        List<Players> player = playersRepository.findAll();
        return playersRepository.findAll();
    }

    @PostMapping("/players")
    public Players players (@RequestBody Players players) {
        return playersRepository.save(players);

    }

    @GetMapping("/teams")
    public ResponseEntity <Players> getPlayerById (Long id){
        Optional<Players> players = playersRepository.findById(id);
        return getPlayerById(id);
    }
}
