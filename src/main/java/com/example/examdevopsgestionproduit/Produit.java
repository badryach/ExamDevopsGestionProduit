package com.example.examdevopsgestionproduit;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table
@Getter@Setter@AllArgsConstructor@NoArgsConstructor@ToString
public class Produit implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String libelle;
    private Double prix;

}
