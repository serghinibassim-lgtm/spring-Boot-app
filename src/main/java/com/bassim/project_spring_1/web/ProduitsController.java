package com.bassim.project_spring_1.web;

import com.bassim.project_spring_1.dtos.ProduitDto;
import com.bassim.project_spring_1.mappers.ProduitMappers;
import com.bassim.project_spring_1.models.Produit;
import com.bassim.project_spring_1.repositories.ProduitRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@AllArgsConstructor
public class ProduitsController {

    ProduitRepository produitRepository;
    ProduitMappers produitMappers;

    @GetMapping("/api/produits")
    public List<ProduitDto> ListToutLesProduits() {
        List<Produit> toutLesProduits = produitRepository.findAll();
        List<ProduitDto> toutLesProduitDtos = toutLesProduits.stream().map(Prod -> {
            return produitMappers.fromProduits(Prod);
        }).collect(Collectors.toList());
        return toutLesProduitDtos;
    }

    @PostMapping("/api/produits")
    public ProduitDto creerProduit(@RequestBody ProduitDto dto) {
        Produit produit = produitMappers.toProduit(dto);
        Produit saved = produitRepository.save(produit);
        return produitMappers.fromProduits(saved);
    }
}
