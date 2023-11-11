package com.example.carsshopfactoriesmaneger.repository.carSpec;

import com.example.carsshopfactoriesmaneger.model.Car;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class ColorSpecificationProvider implements SpecificationProvider<Car>{
    @Override
    public String getKey() {
        return "color";
    }

    @Override
    public Specification<Car> getSpecification(String[] params) {
        return (root, query, criteriaBuilder) -> root.get("color").in(Arrays.stream(params).toArray());
    }
}
