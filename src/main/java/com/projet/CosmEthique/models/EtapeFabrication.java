package com.projet.CosmEthique.models;

import lombok.Data;


import javax.persistence.*;
@Data
@Entity
@Table(name = "etape_fabrication")


public class EtapeFabrication {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_etape;

    private String nom_etape;

    public EtapeFabrication(Long id_etape, String nom_etape) {
        this.id_etape = id_etape;
        this.nom_etape = nom_etape;
    }
}
