package MartinPeltzer.demo_spring_jpa.controller;

import MartinPeltzer.demo_spring_jpa.model.Client;
import MartinPeltzer.demo_spring_jpa.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public class ClientController {

    @Autowired
    private ClientRepository clientRepository;

    @GetMapping(value = "/clients")
    public ResponseEntity<Object> getClients() {
        List<Client> clients = clientRepository.findAll();
        return new ResponseEntity<>(clients, HttpStatus.OK);
    }


}
