package com.example.Solo.Spring.Project.repository;

import com.example.Solo.Spring.Project.model.Players;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayersRepository  extends JpaRepository<Players, Long>  {


      Players findByFirstName(String firstName);
}
