package MartinPeltzer.demo_spring_jpa.controller;

import MartinPeltzer.demo_spring_jpa.model.Client;
import MartinPeltzer.demo_spring_jpa.repository.ClientRepository;
import MartinPeltzer.demo_spring_jpa.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ClientController {

    //Nu praten met de "Service". Gebruik Postman om te testen
    @Autowired
    private ClientService clientService;

    @GetMapping(value = "/clients")
    public ResponseEntity<Object> getClients() {
        List<Client> clients = clientService.getAllClients();
        return new ResponseEntity<>(clients, HttpStatus.OK);
    }
    //"localhost:8080/clients"

    @GetMapping(value = "/clients/{id}")
    public ResponseEntity<Object> getClients(@PathVariable("id") long id) {
        Client client = clientService.getClientById(id);
        return new ResponseEntity<>(client, HttpStatus.OK);
    }
    //"localhost:8080/clients/1"

    @DeleteMapping(value = "/clients/{id}")
    public ResponseEntity<Object> deleteClient(@PathVariable("id") long id) {
        clientService.deleteClient(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
    //"localhost:8080/clients/1" (methode eerst op DELETE zetten).




}
