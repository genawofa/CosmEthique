package com.projet.CosmEthique.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.projet.CosmEthique.models.Fabriquer;
import com.projet.CosmEthique.repository.FabriquerRepository;

import java.util.List;
import java.util.Optional;

@Service
public class FabriquerService {

    private final FabriquerRepository fabriquerRepository;

    @Autowired
    public FabriquerService(FabriquerRepository fabriquerRepository) {
        this.fabriquerRepository = fabriquerRepository;
    }

    // Opération de création
    public Fabriquer createFabriquer(Fabriquer fabriquer) {
        // Logique métier, validation, etc.
        return fabriquerRepository.save(fabriquer);
    }

    // Opération de lecture
    public List<Fabriquer> getAllFabriquers() {
        return fabriquerRepository.findAll();
    }

    public Optional<Fabriquer> getFabriquerById(/* Ajoutez les paramètres nécessaires */) {
        // Logique métier, validation, etc.
        return fabriquerRepository.findById(/* Ajoutez les paramètres nécessaires */);
    }

    // Opération de mise à jour
    public Fabriquer updateFabriquer(/* Ajoutez les paramètres nécessaires */) {
        // Logique métier, validation, etc.
        return fabriquerRepository.save(/* Ajoutez les paramètres nécessaires */);
    }

    // Opération de suppression
    public void deleteFabriquer(/* Ajoutez les paramètres nécessaires */) {
        // Logique métier, validation, etc.
        fabriquerRepository.deleteById(/* Ajoutez les paramètres nécessaires */);
    }
}

