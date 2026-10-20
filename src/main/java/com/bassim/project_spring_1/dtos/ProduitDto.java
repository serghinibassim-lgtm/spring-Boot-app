package com.bassim.project_spring_1.dtos;

import com.bassim.project_spring_1.models.Categorie;
import lombok.Data;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Data
public class ProduitDto {
    Long id;
    String nom;
    String description;
    BigDecimal prix;
    String codeBarre;
    LocalDate dateExpiration;
    CategorieDto categorie;
    FournisseurDto fournisseur;
    DetailProduitDto detailProduit;
    List<TagDto> tags;
}
