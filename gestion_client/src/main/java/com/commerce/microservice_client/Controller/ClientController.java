package com.commerce.microservice_client.Controller;


import com.commerce.microservice_client.model.Client;
import com.commerce.microservice_client.service.ClientService;
import com.commerce.microservice_client.service.impl.ClientServiceImpl;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Api("microservice1")
@RestController
@RequestMapping("/")
@CrossOrigin(origins = "http://localhost:9002")
public class ClientController {

    @Autowired
    private ClientService service;

    @GetMapping("/clients")
    public List<Client> listClients() {
        return service.listClients();
    }
    @GetMapping("/clientsActifs")
    public List<Client> clientActif() {
        return service.findAllAllByStatut();
    }
    @GetMapping("/clients/{id}")
    public Optional<Client> clientById(@PathVariable Integer id) {
        return service.findClientById(id);
    }

    @PostMapping("/client/create")
    public Client createClient(@RequestBody Client client) {
        return service.createClient(client);
    }
    @PutMapping("/client/{id}/update")
    public void updateClient(@RequestBody Client client) {
        service.updateClient(client);
    }
    @DeleteMapping("/client/delete/{id}")
    public void deleteClient(@PathVariable("id") Integer id) {
        service.deleteClient(id);
    }

}
