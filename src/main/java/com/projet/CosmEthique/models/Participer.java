package com.projet.CosmEthique.models;
import lombok.Data;

import javax.persistence.*;

    @Data
    @Entity
    @Table(name = "PARTICIPER")
    public class Participer {
        @Id
        @ManyToOne
        @JoinColumn(name = "ID_SEANCE")
        private Seance seance;

        @Id
        @ManyToOne
        @JoinColumn(name = "ID_INSCRIT")
        private Inscrit inscrit;

        public Participer(Seance seance , Inscrit inscrit) {
            this.seance = seance;
            this.inscrit = inscrit;
        }
        }

