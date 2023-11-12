package com.projet.CosmEthique.service;

import com.projet.CosmEthique.models.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.projet.CosmEthique.repository.FabriquerRepository;
import com.projet.CosmEthique.repository.RecetteRepository;

import javax.persistence.Entity;
import java.util.*;
import lombok.Data;

import java.util.Optional;
@Data
@Entity
@Service
public class FabriquerService {

    @Autowired
    private FabriquerRepository fabriquerRepository;

    @Autowired
    private RecetteRepository recetteRepository;

    public void fabriquerRecette(Long idRecette) {
        // Récupérer tous les éléments nécessaires de la base de données
        List<Fabriquer> fabriques = fabriquerRepository.findByRecetteId(idRecette);

        // Variables pour stocker les étapes, ingrédients et quantités nécessaires
        List<EtapeFabrication> etapes = new ArrayList<>();
        Map<Ingredient, Double> ingredientsQuantites = new HashMap<>();
        Map<Materiel, Double> materielQuantites = new HashMap<>();

        // Boucle à travers les Fabriquer pour récupérer les données nécessaires
        for (Fabriquer fabriquer : fabriques) {
            etapes.add(fabriquer.getEtapeFabrication());
            ingredientsQuantites.put(fabriquer.getIngredient(), fabriquer.getQuantiteIngredient());
        }

        // Récupérer la recette à partir de l'ID
        Recette recette = recetteRepository.findById(idRecette)
                .orElseThrow(() -> new IllegalArgumentException("Recette non trouvée pour l'ID : " + idRecette));

        // Appeler une méthode qui utilise les données récupérées pour générer la recette
        genererRecetteAvecEtapesIngredients(recette, etapes, ingredientsQuantites);

        // Si la recette a été générée avec succès, vous pouvez effectuer des opérations supplémentaires
        // ou marquer la recette comme générée, selon vos besoins
        recette.setGeneree(true);
        recetteRepository.save(recette);
    }

    private void genererRecetteAvecEtapesIngredients(Recette recette, List<EtapeFabrication> etapes, Map<Ingredient, Double> ingredientsQuantites) {
    }
}



















