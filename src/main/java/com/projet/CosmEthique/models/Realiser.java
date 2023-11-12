package com.projet.CosmEthique.models;

import javax.persistence.*;

@Entity
public class Realiser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRealiser;

    @ManyToOne
    @JoinColumn(name = "idRecette")
    private Recette recette;

    @ManyToOne
    @JoinColumn(name = "idSeance")
    private Seance seance;



}
