package com.projet.CosmEthique.service;

import com.projet.CosmEthique.models.Inscrit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import com.projet.CosmEthique.models.Participer;
import com.projet.CosmEthique.repository.ParticiperRepository;

@Service
public class ParticiperService {

    private final ParticiperRepository participerRepository;

    @Autowired
    public ParticiperService(ParticiperRepository participerRepository) {
        this.participerRepository = participerRepository;
    }

    public Participer createParticiper(Participer participer) {
        return participerRepository.save(participer);
    }

    public List<Participer> getAllParticipers() {
        return participerRepository.findAll();
    }

    public Optional<Participer> getParticiperById(Long id) {
        return participerRepository.findById(id);
    }

    public Participer updateParticiper(Long id, Participer newParticiper) {
        return participerRepository.findById(id)
                .map(participer -> {
                    participer.setInscrit(newParticiper.getInscrit());
                    participer.setSeance(newParticiper.getSeance());
                    // Mettez à jour les champs nécessaires
                    return participerRepository.save(participer);
                })
                .orElse(null);
    }

    public void deleteParticiper(Long id) {
        participerRepository.deleteById(id);
    }
}

