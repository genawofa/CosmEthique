package com.projet.CosmEthique.repository;

import com.projet.CosmEthique.models.Realiser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RealiserRepository extends JpaRepository<Realiser, Long> {
}

