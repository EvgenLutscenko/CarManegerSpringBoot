package com.example.carsshopfactoriesmaneger.service;


import com.example.carsshopfactoriesmaneger.model.Factory;

import java.util.List;

public interface FactoryService {
    Factory save(Factory factory);

    List<Factory> findAll();

    void deleteByID(Integer id);
}
