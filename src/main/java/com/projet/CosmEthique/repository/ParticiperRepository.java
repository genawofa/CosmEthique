package com.projet.CosmEthique.repository;

import com.projet.CosmEthique.models.Participer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ParticiperRepository extends JpaRepository<Participer, Long> {

}
