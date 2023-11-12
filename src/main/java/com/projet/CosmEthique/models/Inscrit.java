package com.projet.CosmEthique.models;
import lombok.Data;

import javax.persistence.*;

    @Data
    @Entity
    @Table(name = "INSCRIT")
    public class Inscrit {
        @Id
        @Column(name = "ID_INSCRIT")
        private String idInscrit;

        @Column(name = "Matricule_inscrit", unique = true)
        private String matriculeInscrit;

        @Column(name = "Prenom_inscrit")
        private String prenomInscrit;

        @Column(name = "Nom_inscrit")
        private String nomInscrit;

        public Inscrit(String idInscrit, String matriculeInscrit, String prenomInscrit, String nomInscrit) {
            this.idInscrit = idInscrit;
            this.matriculeInscrit = matriculeInscrit;
            this.prenomInscrit = prenomInscrit;
            this.nomInscrit = nomInscrit;
        }
    }


