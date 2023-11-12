package com.projet.CosmEthique.repository;

import com.projet.CosmEthique.models.Propriete;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProprieteRepository extends JpaRepository<Propriete, Long> {

}
