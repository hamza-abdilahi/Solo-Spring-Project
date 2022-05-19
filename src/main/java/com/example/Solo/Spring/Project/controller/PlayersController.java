package com.example.Solo.Spring.Project.controller;

import com.example.Solo.Spring.Project.model.Players;
import com.example.Solo.Spring.Project.model.Teams;
import com.example.Solo.Spring.Project.repository.PlayersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("player")

public class PlayersController {


    @Autowired
    PlayersRepository playersRepository;

    public PlayersController(PlayersRepository playersRepository) {
        this.playersRepository = playersRepository;
    }

    @GetMapping("/players")
    public List<Players> members() {
        List<Players> player = playersRepository.findAll();
        return playersRepository.findAll();
    }

    @PostMapping("/players")
    public Players players (@RequestBody Players players) {
        return playersRepository.save(players);

    }

    @GetMapping("/players")
    public ResponseEntity <Players> getPlayerById (Long id){
        Optional<Players> players = playersRepository.findById(id);
        return getPlayerById(id);
    }
}
