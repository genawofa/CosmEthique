package com.projet.CosmEthique.repository;

import com.projet.CosmEthique.models.Inscrit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface InscritRepository extends JpaRepository<Inscrit, Long> {

}
