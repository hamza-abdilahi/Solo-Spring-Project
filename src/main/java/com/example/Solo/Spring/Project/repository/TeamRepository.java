package com.example.Solo.Spring.Project.repository;

import com.example.Solo.Spring.Project.model.Teams;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TeamRepository extends JpaRepository<Teams, Long> {
    @Query(value = "SELECT * FROM PLAYER ORDER BY LAST_NAME", nativeQuery = true)
    List<Teams> findAllOrdered();
}
