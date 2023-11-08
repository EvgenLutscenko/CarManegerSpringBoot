package com.example.carsshopfactoriesmaneger.model;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import java.util.List;
import java.util.Set;

@Data
@Entity
@SQLDelete(sql = "UPDATE factories SET is_delete=true WHERE id = ?")
@Where(clause = "is_delete=false")
@Table(name = "factories")
public class Factory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String location;

    @Column(name = "is_delete", nullable = false)
    private boolean isDelete;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "factory")
    private List<Car> cars;
}
