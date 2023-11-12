package com.projet.CosmEthique.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.projet.CosmEthique.models.Recette;
import com.projet.CosmEthique.repository.RecetteRepository;

import java.util.List;
import java.util.Optional;

@Service
public class RecetteService {

    private final RecetteRepository recetteRepository;

    @Autowired
    public RecetteService(RecetteRepository recetteRepository) {
        this.recetteRepository = recetteRepository;
    }

    public Recette createRecette(Recette recette) {
        return recetteRepository.save(recette);
    }

    public List<Recette> getAllRecettes() {
        return recetteRepository.findAll();
    }

    public Optional<Recette> getRecetteById(Long id) {
        return recetteRepository.findById(id);
    }

    public Recette updateRecette(Long id, Recette newRecette) {
        return recetteRepository.findById(id)
                .map(recette -> {
                    recette.setId_recette(newRecette.getId_recette());
                    recette.setNom_recette(newRecette.getNom_recette());
                    recette.setDescription_recette(newRecette.getDescription_recette());
                    // Mettez à jour d'autres champs si nécessaire
                    return recetteRepository.save(recette);
                })
                .orElse(null);
    }

    public void deleteRecette(Long id) {
        recetteRepository.deleteById(id);
    }
}
