package com.example.controle_jee.repository;

import com.example.controle_jee.entities.car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<car,Long> {
}
