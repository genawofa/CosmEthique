package com.projet.CosmEthique.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import com.projet.CosmEthique.models.EtapeFabrication;
import com.projet.CosmEthique.repository.EtapeFabricationRepository;

import javax.persistence.Id;

@Service
public class EtapeFabricationService {

    private final EtapeFabricationRepository etapeFabricationRepository;

    @Autowired
    public EtapeFabricationService(EtapeFabricationRepository etapeFabricationRepository) {
        this.etapeFabricationRepository = etapeFabricationRepository;
    }

    public EtapeFabrication createEtapeFabrication(EtapeFabrication etapeFabrication) {
        return etapeFabricationRepository.save(etapeFabrication);
    }

    public List<EtapeFabrication> getAllEtapesFabrication() {
        return etapeFabricationRepository.findAll();
    }

    public Optional<EtapeFabrication> getEtapeFabricationById(Long Id) {
        return etapeFabricationRepository.findById(Id);
    }

    public EtapeFabrication updateEtapeFabrication(Long Id, EtapeFabrication newEtapeFabrication) {
        return etapeFabricationRepository.findById(Id)
                .map(etapeFabrication -> {
                    etapeFabrication.setId_etape(newEtapeFabrication.getId_etape());
                    etapeFabrication.setNom_etape(newEtapeFabrication.getNom_etape());
                    // Mettez à jour les champs nécessaires
                    return etapeFabricationRepository.save(etapeFabrication);
                })
                .orElse(null);
    }

    public void deleteEtapeFabrication(Long Id) {
        etapeFabricationRepository.deleteById(Id);
    }
}

