package com.commerce.microservice_client.model;

import lombok.Data;

import javax.persistence.*;
@Data
@Entity
public class Client {
   @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idclient;

    @Column(name = "nom", nullable = false)
    private String nom;

    @Column(name = "prenoms", nullable = false)
    private String prenoms;

    @Column(name = "email")
    private String email;

    @Column(name = "contact")
    private String contact;

    @Column(name = "typeclient")
    private String typeClient;

    @Column(name = "statut")
    private Boolean statut;

}
