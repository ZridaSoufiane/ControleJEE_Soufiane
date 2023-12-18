package com.example.controle_jee.dtos;

import jakarta.persistence.Entity;
import lombok.*;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class carDTO {
    private String model;
    private String color;
    private float prix;


}
