package com.example.Solo.Spring.Project.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Players {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String teamName;
    private String firstName;
    private String lastName;
    private String position;
    private int age;
    private int points;

    @OneToMany(mappedBy = "players", cascade = CascadeType.ALL)
    private List<Teams> teams;

    public Players(){

    }

    public Players(Long id, String teamName, String firstName, String lastName, String position, int age, int points) {
        this.id = id;
        this.teamName = teamName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.age = age;
        this.points = points;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
}
