package com.projet.CosmEthique.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.projet.CosmEthique.models.Stock;
import org.springframework.stereotype.Repository;


@Repository
public interface StockRepository extends JpaRepository<Stock, Long> {


}
