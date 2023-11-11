package com.example.carsshopfactoriesmaneger.repository.specProviderMan;

import com.example.carsshopfactoriesmaneger.repository.carSpec.SpecificationProvider;

public interface SpecificationProviderManager<T> {
    SpecificationProvider<T> getSpecificationProvider(String key);
}
