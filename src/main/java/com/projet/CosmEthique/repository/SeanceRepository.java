package com.projet.CosmEthique.repository;

import com.projet.CosmEthique.models.Seance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface SeanceRepository extends JpaRepository<Seance, Long> {

}