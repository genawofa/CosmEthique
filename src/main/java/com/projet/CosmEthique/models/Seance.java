package com.projet.CosmEthique.models;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;


    @Data
    @Entity
    @Table(name = "SEANCE")
    public class Seance {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "ID_SEANCE")
        private Long idSeance;

        @Column(name = "Date_seance")
        private Date dateSeance;

        @Column(name = "Lieu_seance")
        private String lieuSeance;

        public Seance(Long idSeance, Date dateSeance, String lieuSeance) {
            this.idSeance = idSeance;
            this.dateSeance = dateSeance;
            this.lieuSeance = lieuSeance;
        }
    }


