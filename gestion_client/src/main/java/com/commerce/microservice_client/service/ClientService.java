package com.commerce.microservice_client.service;

import com.commerce.microservice_client.model.Client;
import com.commerce.microservice_client.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface ClientService {

    Client createClient(Client client);

    Client updateClient(Client client);

    List<Client> listClients();

    List<Client> findAllAllByStatut(); //les clients actifs
    void deleteClient(Integer id);

    Optional<Client> findClientById(Integer id);

}
