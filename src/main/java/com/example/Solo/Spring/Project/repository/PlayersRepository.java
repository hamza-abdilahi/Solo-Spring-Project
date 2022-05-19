package com.example.Solo.Spring.Project.repository;

import com.example.Solo.Spring.Project.model.players;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayersRepository  extends JpaRepository<players, Long>  {


    players findByName(String name);
}
