package com.projet.CosmEthique.repository;

import com.projet.CosmEthique.models.EtapeFabrication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EtapeFabricationRepository extends JpaRepository<EtapeFabrication, Long> {

}