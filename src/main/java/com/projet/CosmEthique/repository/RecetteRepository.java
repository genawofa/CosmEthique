package com.projet.CosmEthique.repository;

import com.projet.CosmEthique.models.Recette;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RecetteRepository extends JpaRepository<Recette, Long> {

}
