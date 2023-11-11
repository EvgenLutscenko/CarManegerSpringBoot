package com.example.carsshopfactoriesmaneger.service;


import com.example.carsshopfactoriesmaneger.dto.factoryDto.FactoryDto;
import com.example.carsshopfactoriesmaneger.dto.factoryDto.FactoryRequestDto;
import com.example.carsshopfactoriesmaneger.model.Factory;

import java.util.List;

public interface FactoryService {
    FactoryDto save(FactoryRequestDto factory);

    List<FactoryDto> findAll();

    void deleteByID(Integer id);
}
