package MartinPeltzer.demo_spring_jpa.controller;

import MartinPeltzer.demo_spring_jpa.model.Client;
import MartinPeltzer.demo_spring_jpa.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController //had ik er nog niet achter staan. Daarom deed hij het eerst niet.
public class ClientController {


    @Autowired
    private ClientRepository clientRepository;

    @GetMapping(value = "/clients")
    public ResponseEntity<Object> getClients() {
        List<Client> clients = clientRepository.findAll(); //.findAll()-->Eens experimenteren met de andere methodes; zie onder
        return new ResponseEntity<>(clients, HttpStatus.OK);
    }
    //"localhost:8080/clients"

    @GetMapping(value = "/clients/{id}")
    public ResponseEntity<Object> getClient(@PathVariable("id") long id) {
        Client client = clientRepository.findById(id).orElse(null); //findById() nu gebruiken, hoort orElse() bij
        return new ResponseEntity<>(client, HttpStatus.OK);
    }
    //"localhost:8080/clients/2"


}
