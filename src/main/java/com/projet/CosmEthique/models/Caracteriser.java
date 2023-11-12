package com.projet.CosmEthique.models;
import javax.persistence.*;



    @Entity
    @Table(name = "CARACTERISER")
    public class Caracteriser {
        @Id
        @ManyToOne
        @JoinColumn(name = "ID_INGREDIENT")
        private Ingredient ingredient;

        @Id
        @ManyToOne
        @JoinColumn(name = "ID_PROPRIETE")
        private Propriete propriete;

        public Caracteriser(Ingredient ingredient, Propriete propriete) {
            this.ingredient = ingredient;
            this.propriete = propriete;
        }
        }

