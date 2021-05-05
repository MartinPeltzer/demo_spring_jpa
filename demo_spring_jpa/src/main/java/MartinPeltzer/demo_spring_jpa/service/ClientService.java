package MartinPeltzer.demo_spring_jpa.service;

import MartinPeltzer.demo_spring_jpa.model.Client;

import java.util.List;

public interface ClientService {

    List<Client> getAllClients();
    Client getClientById(long id);
    void deleteClient(long id);
}
