package com.example.carsshopfactoriesmaneger.repository.carSpec;

import com.example.carsshopfactoriesmaneger.model.Car;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class ModelSpecificationProvider implements SpecificationProvider<Car> {
    @Override
    public String getKey() {
        return "model";
    }

    @Override
    public Specification<Car> getSpecification(String[] params) {
        return (root, query, criteriaBuilder) -> root.get("model").in(Arrays.stream(params).toArray());
    }
}
