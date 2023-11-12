package com.projet.CosmEthique.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.projet.CosmEthique.models.Materiel;
import com.projet.CosmEthique.repository.MaterielRepository;

import lombok.Data;
@Data
@Service
public class MaterielService {

    private final MaterielRepository materielRepository;

    @Autowired
    public MaterielService(MaterielRepository materielRepository) {
        this.materielRepository = materielRepository;
    }

    public Materiel createMateriel(Materiel materiel) {
        return materielRepository.save(materiel);
    }

    public List<Materiel> getAllMateriels() {
        return materielRepository.findAll();
    }

    public Optional<Materiel> getMaterielById(Long id) {
        return materielRepository.findById(id);
    }

    public Materiel updateMateriel(Long id, Materiel newMateriel) {
        return materielRepository.findById(id)
                .map(materiel -> {
                    materiel.setNom_materiel(newMateriel.getNom_materiel());
                    materiel.setPrix_materiel(newMateriel.getPrix_materiel());
                    // Mettez à jour d'autres champs si nécessaire
                    return materielRepository.save(materiel);
                })
                .orElse(null);

    }
    // Opération de suppression
    public void deleteMateriel(Long id) {
        materielRepository.deleteById(id);
    }
}


