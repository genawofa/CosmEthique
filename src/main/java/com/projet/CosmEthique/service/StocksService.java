package com.projet.CosmEthique.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.projet.CosmEthique.models.Stock;
import com.projet.CosmEthique.repository.StockRepository;

import lombok.Data;

@Data
@Service
public class StocksService {

    private final StockRepository stockRepository;

    @Autowired
    public StocksService(StockRepository stockRepository) {
        this.stockRepository = stockRepository;
    }

    // Opération de création
    public Stock createStock(Stock stock) {
        // Logique métier, validation, etc.
        return stockRepository.save(stock);
    }

    // Opération de lecture
    public List<Stock> getAllStocks() {
        return stockRepository.findAll();
    }

    public Optional<Stock> getStocksById(Long id) {
        return stockRepository.findById(id);
    }

    // Opération de mise à jour
    public Stock updateStock(Long id, Stock newStock) {
        // Logique métier, validation, etc.
        return stockRepository.findById(id)
                .map(stock -> {
                    stock.setQuantiteEntrante(newStock.getQuantiteEntrante());
                    stock.setQuantiteSortante(newStock.getQuantiteSortante());
                    // Mettez à jour d'autres champs si nécessaire
                    return stockRepository.save(stock);
                })
                .orElse(null);
    }

    // Opération de suppression
    public void deleteStocks(Long id) {
        stockRepository.deleteById(id);
    }
}

