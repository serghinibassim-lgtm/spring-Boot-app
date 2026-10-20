package com.bassim.project_spring_1.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FournisseurDto {
    Long id;
    String nom;
    String contact;
    String adresse;
}
