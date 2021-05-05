package MartinPeltzer.demo_spring_jpa.service;

import MartinPeltzer.demo_spring_jpa.model.Client;

import java.util.List;

public interface ClientService {

    List<Client>getAllClients();
    Client getClientById(long id);
    //Dit komt allemaal overeen met wat we in de repository hebben gezegd
    //Omdat dit een interface is, is dit ook het enige wat hier hoeft te staan
    void deleteClient(long id);
    long saveClient(Client client);



}
