package com.example.controle_jee.service;

import com.example.controle_jee.entities.car;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.swing.plaf.PanelUI;
import java.util.List;

public interface CarManager  {
    public List<car>getCarByModel(String model);
    public List<car>getCareAndPrice(Double price);


}
