package com.example.carsshopfactoriesmaneger.repository;


import com.example.carsshopfactoriesmaneger.model.Car;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CarRepository extends JpaRepository<Car, Integer> {

    List<Car> findAll(Specification<Car> carSpecification);
}
