package com.projet.CosmEthique.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.projet.CosmEthique.models.Propriete;
import com.projet.CosmEthique.repository.ProprieteRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ProprieteService {

    private final ProprieteRepository proprieteRepository;

    @Autowired
    public ProprieteService(ProprieteRepository proprieteRepository) {
        this.proprieteRepository = proprieteRepository;
    }

    public Propriete createPropriete(Propriete propriete) {
        return proprieteRepository.save(propriete);
    }

    public List<Propriete> getAllProprietes() {
        return proprieteRepository.findAll();
    }

    public Optional<Propriete> getProprieteById(Long id) {
        return proprieteRepository.findById(id);
    }

    public Propriete updatePropriete(Long id, Propriete newPropriete) {
        return proprieteRepository.findById(id)
                .map(propriete -> {
                    propriete.setNomPropriete(newPropriete.getNomPropriete());
                    // Mettez à jour les champs nécessaires
                    return proprieteRepository.save(propriete);
                })
                .orElse(null);
    }

    public void deletePropriete(Long id) {
        proprieteRepository.deleteById(id);
    }
}

