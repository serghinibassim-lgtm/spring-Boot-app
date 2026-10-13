package com.bassim.project_spring_1.models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor @NoArgsConstructor
public class Categorie {
    @Id  @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String nom;
    String description;

    @OneToMany(mappedBy = "categorie")
    List<Produit>  produitList;

}
