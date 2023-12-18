package com.example.controle_jee.mappers;

import com.example.controle_jee.dtos.carDTO;
import com.example.controle_jee.entities.car;
import org.modelmapper.ModelMapper;

public class CarMapper {
private ModelMapper modelMapper= new ModelMapper();

public car fromCarDTOtoCar(carDTO carDTO)
{
    return modelMapper.map(carDTO,car.class);
}
public carDTO fromCartoCarDTO(car car)
{
    return modelMapper.map(car,carDTO.class);
}
}
