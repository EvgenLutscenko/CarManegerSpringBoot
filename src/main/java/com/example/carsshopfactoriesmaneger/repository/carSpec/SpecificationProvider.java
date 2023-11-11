package com.example.carsshopfactoriesmaneger.repository.carSpec;

import com.example.carsshopfactoriesmaneger.model.Car;
import org.springframework.data.jpa.domain.Specification;

public interface SpecificationProvider<T> {
    String getKey();
    Specification<T> getSpecification(String[] params);
}