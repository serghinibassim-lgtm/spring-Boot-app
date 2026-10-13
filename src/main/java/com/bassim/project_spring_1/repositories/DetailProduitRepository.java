package com.bassim.project_spring_1.repositories;

import com.bassim.project_spring_1.models.DetailProduit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DetailProduitRepository extends JpaRepository<DetailProduit,Long> {
}
