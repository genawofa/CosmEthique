package com.projet.CosmEthique.repository;

import com.projet.CosmEthique.models.Caracteriser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CaracteriserRepository extends JpaRepository<Caracteriser, Long> {

}