package MartinPeltzer.demo_spring_jpa.controller;

import MartinPeltzer.demo_spring_jpa.model.Client;
import MartinPeltzer.demo_spring_jpa.repository.ClientRepository;
import MartinPeltzer.demo_spring_jpa.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ClientController {

    @Autowired
    private ClientService clientService;

    @GetMapping(value = "/clients")
    public ResponseEntity<Object> getClients() {
        List<Client> clients = clientService.getAllClients();
        return new ResponseEntity<>(clients, HttpStatus.OK);
    }
    //localhost:8080/clients

    @GetMapping(value = "/clients/{id}")
    public ResponseEntity<Object> getClients(@PathVariable("id") long id) {
        Client client = clientService.getClientById(id);
        return new ResponseEntity<>(client, HttpStatus.OK);
    }
    //localhost:8080/clients/1

    @DeleteMapping(value = "/clients/{id}")
    public ResponseEntity<Object> deleteClient(@PathVariable("id") long id) {
        clientService.deleteClient(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);

    }
    //localhost:8080/clients/1

    @PostMapping(value = "/clients")
    public ResponseEntity<Object> saveClient(@RequestBody Client client) {
        long newId = clientService.saveClient(client);
        return new ResponseEntity<>(newId, HttpStatus.CREATED);
    }
    //localhost:8080/clients

    @PutMapping(value = "/clients/{id}")
    public ResponseEntity<Object> updateClient(@PathVariable("id") int id, @RequestBody Client client) {
        clientService.updateClient(id, client); //clientUpdate bestaat dan nog niet-->In de clientService gaan maken
        return new ResponseEntity<>(HttpStatus.OK);
    }
    //localhost:8080/clients/1

    @GetMapping(value = "/clients/lastname/{lastname}")
    public ResponseEntity<Object> getClientByLastName(@PathVariable("lastname") String lastName) {
        Client client = clientService.getClientByLastName(lastName);
        return new ResponseEntity<>(client, HttpStatus.OK);
    }
    //localhost:8080/clients/lastname/Hallo
}


