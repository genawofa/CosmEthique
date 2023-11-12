package com.projet.CosmEthique.models;

import lombok.Data;


import javax.persistence.*;
@Data
@Entity
@Table(name = "materiel")
public class Materiel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_materiel;

    private String nom_materiel;

    private Double prix_materiel;

    @ManyToOne
    @JoinColumn(name = "id_stock")
    private Stock stock;

    public Materiel(Long id_materiel, String nom_materiel, Double prix_materiel, Stock stock) {
        this.id_materiel = id_materiel;
        this.nom_materiel = nom_materiel;
        this.prix_materiel = prix_materiel;
        this.stock = stock;
    }


    @Override
    public String toString() {
        return "Materiel{" +
                "idMateriel=" + id_materiel +
                ", nomMateriel='" + nom_materiel + '\'' +
                ", prixMateriel=" + prix_materiel +
                '}';

    }
}
