package com.projet.CosmEthique.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.projet.CosmEthique.models.Seance;
import com.projet.CosmEthique.repository.SeanceRepository;

import java.util.List;
import java.util.Optional;

@Service
public class SeanceService {

    private final SeanceRepository seanceRepository;

    @Autowired
    public SeanceService(SeanceRepository seanceRepository) {
        this.seanceRepository = seanceRepository;
    }

    public Seance createSeance(Seance seance) {
        return seanceRepository.save(seance);
    }

    public List<Seance> getAllSeances() {
        return seanceRepository.findAll();
    }

    public Optional<Seance> getSeanceById(Long id) {
        return seanceRepository.findById(id);
    }

    public Seance updateSeance(Long id, Seance newSeance) {
        return seanceRepository.findById(id)
                .map(seance -> {
                    seance.setDateSeance(newSeance.getDateSeance());
                    seance.setLieuSeance(newSeance.getLieuSeance());
                    // Mettez à jour d'autres champs si nécessaire
                    return seanceRepository.save(seance);
                })
                .orElse(null);
    }

    public void deleteSeance(Long id) {
        seanceRepository.deleteById(id);
    }
}
