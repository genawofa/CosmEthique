package com.projet.CosmEthique.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import com.projet.CosmEthique.models.Realiser;
import com.projet.CosmEthique.repository.RealiserRepository;

@Service
public class RealiserService {

    private final RealiserRepository realiserRepository;

    @Autowired
    public RealiserService(RealiserRepository realiserRepository) {
        this.realiserRepository = realiserRepository;
    }

    public Realiser createRealiser(Realiser realiser) {
        return realiserRepository.save(realiser);
    }

    public List<Realiser> getAllRealisers() {
        return realiserRepository.findAll();
    }

    public Optional<Realiser> getRealiserById(Long id) {
        return realiserRepository.findById(id);
    }

    public Realiser updateRealiser(Long id, Realiser newRealiser) {
        return realiserRepository.findById(id)
                .map(realiser -> {

                    // Mettez à jour les champs nécessaires//en attente pour l'instant
                    return realiserRepository.save(realiser);
                })
                .orElse(null);
    }

    public void deleteRealiser(Long id) {
        realiserRepository.deleteById(id);
    }
}

