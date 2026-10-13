package com.bassim.project_spring_1.repositories;

import com.bassim.project_spring_1.models.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CatgorieRepository extends JpaRepository<Categorie,Long> {
}
