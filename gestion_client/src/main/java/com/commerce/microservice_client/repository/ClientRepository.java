package com.commerce.microservice_client.repository;

import com.commerce.microservice_client.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface ClientRepository extends JpaRepository<Client, Integer> {
    @Query("From Client c where c.statut = true")
    List<Client> findAllAllByStatut();
}
