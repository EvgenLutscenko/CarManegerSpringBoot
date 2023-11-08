package com.example.carsshopfactoriesmaneger.mapper;

import com.example.carsshopfactoriesmaneger.config.MapperConfig;
import com.example.carsshopfactoriesmaneger.dto.carDto.CarDto;
import com.example.carsshopfactoriesmaneger.model.Car;
import org.mapstruct.Mapper;

@Mapper(config = MapperConfig.class)
public interface CarMapper {
    CarDto toDto(Car car);
}
