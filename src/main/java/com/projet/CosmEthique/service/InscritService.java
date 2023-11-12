package com.projet.CosmEthique.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import com.projet.CosmEthique.models.Inscrit;
import com.projet.CosmEthique.repository.InscritRepository;

@Service
public class InscritService {

    private final InscritRepository inscritRepository;

    @Autowired
    public InscritService(InscritRepository inscritRepository) {
        this.inscritRepository = inscritRepository;
    }

    public Inscrit createInscrit(Inscrit inscrit) {
        return inscritRepository.save(inscrit);
    }

    public List<Inscrit> getAllInscrits() {
        return inscritRepository.findAll();
    }

    public Optional<Inscrit> getInscritById(String id) {
        return inscritRepository.findById(Long.valueOf(id));
    }

    public Inscrit updateInscrit(String id, Inscrit newInscrit) {
        return inscritRepository.findById(Long.valueOf(id))
                .map(inscrit -> {
                    inscrit.setIdInscrit(newInscrit.getIdInscrit());
                    inscrit.setMatriculeInscrit(newInscrit.getMatriculeInscrit());
                    inscrit.setNomInscrit(newInscrit.getNomInscrit());
                    inscrit.setPrenomInscrit(newInscrit.getNomInscrit());

                    // Mettez à jour les champs nécessaires//peut être les passwords à ajouter
                    return inscritRepository.save(inscrit);
                })
                .orElse(null);
    }

    public void deleteInscrit(String id) {
        inscritRepository.deleteById(Long.valueOf(id));
    }
}

