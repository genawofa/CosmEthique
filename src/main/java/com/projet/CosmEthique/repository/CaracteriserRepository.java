package com.projet.CosmEthique.repository;

import com.projet.CosmEthique.models.Caracteriser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.util.Optional;


@Repository
public interface CaracteriserRepository extends JpaRepository<Caracteriser, Long> {

        Optional<Caracteriser> findByIdIngredientAndIdPropriete(Long idIngredient, Long idPropriete);

    Optional<Caracteriser> findById(Long idIngredient, Long idPropriete);

    void deleteById(Long idIngredient, Long idPropriete);
}


