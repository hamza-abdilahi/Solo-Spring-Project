package com.example.Solo.Spring.Project.model;

import javax.annotation.processing.Generated;
import javax.persistence.*;

@Entity
public class Teams {

    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    private String teamNames;
    private int gamesPlayed;
    private int wins;
    private int loses;

    @ManyToOne
    @JoinColumn(name = "players_id")
    private players players;

    public players getPlayers() {
        return players;
    }

    public void setPlayers(players players) {
        this.players = players;
    }

    public Teams() {
    }

    public Teams(Long id, String teamNames, int gamesPlayed, int wins, int loses) {
        this.id = id;
        this.teamNames = teamNames;
        this.gamesPlayed = gamesPlayed;
        this.wins = wins;
        this.loses = loses;
    }

    public String getTeamNames() {
        return teamNames;
    }

    public void setTeamNames(String teamNames) {
        this.teamNames = teamNames;
    }

    public int getGamesPlayed() {
        return gamesPlayed;
    }

    public void setGamesPlayed(int gamesPlayed) {
        this.gamesPlayed = gamesPlayed;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getLoses() {
        return loses;
    }

    public void setLoses(int loses) {
        this.loses = loses;
    }

    private Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }



}
