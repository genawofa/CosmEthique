package com.projet.CosmEthique.models;

import lombok.Data;
import javax.persistence.*;
@Data
@Entity
@Table(name = "STOCK")
public class Stock {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_STOCK")
    private Long idStock;

    @Column(name = "Quantite_entrante")
    private Integer quantiteEntrante;

    @Column(name = "Quantite_sortante")
    private Integer quantiteSortante;


    public void Stock(Long idStock, int quantiteEntrante, int quantiteSortante) {
        this.idStock = idStock;
        this.quantiteEntrante = quantiteEntrante;
        this.quantiteSortante = quantiteSortante;
    }


    public Integer getQuantiteEntrante() {
        return null;
    }
}



