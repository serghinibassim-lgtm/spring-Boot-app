package com.bassim.project_spring_1.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DetailProduit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String fabricant;
    String paysOrigine;
    String composition;
    String dosage;
    String indications;
}
