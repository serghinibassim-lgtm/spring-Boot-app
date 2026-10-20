package com.bassim.project_spring_1.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CategorieDto {
    Long id;
    String nom;
    String description;
}
