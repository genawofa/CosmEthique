package com.projet.CosmEthique.models;

import lombok.Data;
import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "recette")

public class Recette {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_recette;
    private String nom_recette;
    private String description_recette;

    public Recette(Long id_recette, String nom_recette, String description_recette) {
        this.id_recette = id_recette;
        this.nom_recette = nom_recette;
        this.description_recette = description_recette;
    }

    public void setGeneree(boolean b) {
    }


    @Entity
    public class RealiserModel {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        public RealiserModel(Long id, Recette recette) {
            this.id = id;
            this.recette = recette;
        }

        @ManyToOne
        @JoinColumn(name = "id_recette")
        private Recette recette;

        @Entity
        public class FabriquerModel {
            @Id
            @GeneratedValue(strategy = GenerationType.IDENTITY)
            private Long idFabriquer;
    @OneToMany(mappedBy = "recette")
    private List<FabriquerModel> fabriquers;

    @OneToMany(mappedBy = "recette")
    private List<RealiserModel> realisers;

            public FabriquerModel(Long idFabriquer, List<FabriquerModel> fabriquers, List<RealiserModel> realisers) {
                this.idFabriquer = idFabriquer;
                this.fabriquers = fabriquers;
                this.realisers = realisers;
            }
        }
}
}