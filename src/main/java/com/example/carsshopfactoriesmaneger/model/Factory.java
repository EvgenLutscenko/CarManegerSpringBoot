package com.example.carsshopfactoriesmaneger.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import java.util.List;
import java.util.Set;

@Data
@Entity
@NoArgsConstructor
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

    @OneToMany(mappedBy = "factory", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Car> cars;
    public Factory(Integer id) {
        this.id = id;
    }
}
