package com.commerce.microservice_client.service.impl;

import com.commerce.microservice_client.model.Client;
import com.commerce.microservice_client.repository.ClientRepository;
import com.commerce.microservice_client.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientServiceImpl implements ClientService {

    private ClientRepository clientRepository;

    @Autowired
    public ClientServiceImpl(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @Override
    public Client createClient(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public Client updateClient(Client client) {
        Client updtClient = clientRepository.findById(client.getIdclient()).get();
        updtClient.setNom(client.getNom());
        updtClient.setPrenoms(client.getPrenoms());
        updtClient.setEmail(client.getEmail());
        updtClient.setTypeClient(client.getTypeClient());
        updtClient.setContact(client.getContact());

        return clientRepository.save(updtClient);

    }

    @Override
    public List<Client> listClients() {
        return clientRepository.findAll() ;
    }

    @Override
    public List<Client> findAllAllByStatut() {
        return clientRepository.findAllAllByStatut();
    }

    @Override
    public void deleteClient(Integer id) {
        Client client = clientRepository.findById(id).get();
        client.setStatut(false);
        clientRepository.save(client);
        //clientRepository.deleteById(id);
    }

    @Override
    public Optional<Client> findClientById(Integer id) {
        return clientRepository.findById(id);
    }
}
