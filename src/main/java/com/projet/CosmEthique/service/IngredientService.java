package com.projet.CosmEthique.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.projet.CosmEthique.models.Ingredient;
import com.projet.CosmEthique.repository.IngredientRepository;

import java.util.List;
import java.util.Optional;

@Service
public class IngredientService {

    private final IngredientRepository ingredientRepository;

    @Autowired
    public IngredientService(IngredientRepository ingredientRepository) {
        this.ingredientRepository = ingredientRepository;
    }

    public Ingredient createIngredient(Ingredient ingredient) {
        return ingredientRepository.save(ingredient);
    }

    public List<Ingredient> getAllIngredients() {
        return ingredientRepository.findAll();
    }

    public Optional<Ingredient> getIngredientById(Long id) {
        return ingredientRepository.findById(id);
    }

    public Ingredient updateIngredient(Long id, Ingredient newIngredient) {
        return ingredientRepository.findById(id)
                .map(ingredient -> {
                    ingredient.setCategorie(newIngredient.getCategorie());
                    ingredient.setNom_ingredient(newIngredient.getNom_ingredient());
                    ingredient.setUnite_litre_kg(newIngredient.getUnite_litre_kg());
                    ingredient.setDensite_unite(newIngredient.getDensite_unite());
                    ingredient.setPrix_ingredient(newIngredient.getPrix_ingredient());
                    ingredient.setDate_peremption(newIngredient.getDate_peremption());

                    // Mettez à jour d'autres champs si nécessaire
                    return ingredientRepository.save(ingredient);
                })
                .orElse(null);
    }

    public void deleteIngredient(Long id) {
        ingredientRepository.deleteById(id);
    }
}
