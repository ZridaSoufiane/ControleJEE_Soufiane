package com.example.controle_jee.entities;

import com.example.controle_jee.dtos.carDTO;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class car {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_car;
    private String model;
    private String color;
    private String matricul;
    private float prix;
}
