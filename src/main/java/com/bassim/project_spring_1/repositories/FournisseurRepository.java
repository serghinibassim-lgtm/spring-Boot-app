package com.bassim.project_spring_1.repositories;

import com.bassim.project_spring_1.models.Fournisseure;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FournisseurRepository extends JpaRepository<Fournisseure,Long> {
}
