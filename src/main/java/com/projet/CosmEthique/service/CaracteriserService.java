package com.projet.CosmEthique.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import com.projet.CosmEthique.models.Caracteriser;
import com.projet.CosmEthique.repository.CaracteriserRepository;

@Service
public class CaracteriserService {

    private final CaracteriserRepository caracteriserRepository;

    @Autowired
    public CaracteriserService(CaracteriserRepository caracteriserRepository) {
        this.caracteriserRepository = caracteriserRepository;
    }

    public Caracteriser createCaracteriser(Caracteriser caracteriser) {
        return caracteriserRepository.save(caracteriser);
    }

    public List<Caracteriser> getAllCaracterisers() {
        return caracteriserRepository.findAll();
    }

    public Optional<Caracteriser> getCaracteriserById(Long idIngredient, Long idPropriete) {
        return caracteriserRepository.findById(idIngredient, idPropriete);
    }

    public Caracteriser updateCaracteriser(Long idIngredient, Long idPropriete, Caracteriser newCaracteriser) {
        return caracteriserRepository.findById(idIngredient, idPropriete)
                .map(caracteriser -> {
                    // Mettez à jour les champs nécessaires
                    return caracteriserRepository.save(caracteriser);
                })
                .orElse(null);
    }

    public void deleteCaracteriser(Long idIngredient, Long idPropriete) {
        caracteriserRepository.deleteById(idIngredient, idPropriete);
    }
}

