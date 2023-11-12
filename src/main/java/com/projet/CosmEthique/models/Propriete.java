package com.projet.CosmEthique.models;

import lombok.Data;
import javax.persistence.*;

@Data
@Entity
@Table(name = "propriete")



public class Propriete {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "ID_PROPRIETE")
        private Long idPropriete;

        @Column(name = "Nom_propriete")
        private String nomPropriete;

        public Propriete(Long idPropriete, String nomPropriete) {
            this.idPropriete = idPropriete;
            this.nomPropriete = nomPropriete;
        }
    }

