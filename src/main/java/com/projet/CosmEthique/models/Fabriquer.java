package com.projet.CosmEthique.models;
import lombok.Data;

import javax.persistence.*;

    @Data
    @Entity
    @Table(name = "FABRIQUER")
    public class Fabriquer {
        @Id
        @ManyToOne
        @JoinColumn(name = "ID_INGREDIENT")
        private Ingredient ingredient;

        @Id
        @ManyToOne
        @JoinColumn(name = "ID_MATERIEL")
        private Materiel materiel;

        @Id
        @ManyToOne
        @JoinColumn(name = "ID_ETAPE")
        private EtapeFabrication etapeFabrication;
        @Id
        @ManyToOne
        @JoinColumn(name = "ID_RECETTE")
        private Recette recette;

        @Column(name = "Quantite_ingredient")
        private double quantiteIngredient;

        @Column(name = "Quantite_materiel")
        private double quantiteMateriel;

        public Fabriquer(Ingredient ingredient, Materiel materiel, EtapeFabrication etapeFabrication, Recette recette, double quantiteIngredient, double quantiteMateriel) {
            this.ingredient = ingredient;
            this.materiel = materiel;
            this.etapeFabrication = etapeFabrication;
            this.recette = recette;
            this.quantiteIngredient = quantiteIngredient;
            this.quantiteMateriel = quantiteMateriel;
        }
    }

