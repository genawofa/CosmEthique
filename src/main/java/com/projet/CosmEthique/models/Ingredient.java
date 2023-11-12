package com.projet.CosmEthique.models;
import java.util.Date;
import lombok.Data;


import javax.persistence.*;

@Entity
@Table(name = "ingredient")

public class Ingredient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_ingredient;

    private String categorie;

    private String nom_ingredient;

    private String unite_litre_kg;

    private Double densite_unite;

    private Double prix_ingredient;

    private Date date_peremption;

    @ManyToOne
    @JoinColumn(name = "id_stock")
    private Stock stock;

    public Ingredient(Long id_ingredient, String categorie, String nom_ingredient, String unite_litre_kg, Double densite_unite, Double prix_ingredient, Date date_peremption, Stock stock) {
        this.id_ingredient = id_ingredient;
        this.categorie = categorie;
        this.nom_ingredient = nom_ingredient;
        this.unite_litre_kg = unite_litre_kg;
        this.densite_unite = densite_unite;
        this.prix_ingredient = prix_ingredient;
        this.date_peremption = date_peremption;
        this.stock = stock;
    }
}
