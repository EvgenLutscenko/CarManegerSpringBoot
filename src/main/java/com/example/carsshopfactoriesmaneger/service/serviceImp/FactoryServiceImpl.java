package com.example.carsshopfactoriesmaneger.service.serviceImp;

import com.example.carsshopfactoriesmaneger.model.Factory;
import com.example.carsshopfactoriesmaneger.repository.FactoryRepository;
import com.example.carsshopfactoriesmaneger.service.FactoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class FactoryServiceImpl implements FactoryService {
    private final FactoryRepository factoryRepository;
    @Override
    public Factory save(Factory factory) {
        return factoryRepository.save(factory);
    }

    @Override
    public List<Factory> findAll() {
        return factoryRepository.findAll();
    }

    @Override
    public void deleteByID(Integer id) {
        factoryRepository.deleteById(id);
    }
}
