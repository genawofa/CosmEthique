package com.projet.CosmEthique.repository;

import com.projet.CosmEthique.models.Fabriquer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface FabriquerRepository extends JpaRepository<Fabriquer, Long> {

}
