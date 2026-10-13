package com.bassim.project_spring_1.repositories;

import com.bassim.project_spring_1.models.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProduitRepository extends JpaRepository<Produit,Long> {

}
