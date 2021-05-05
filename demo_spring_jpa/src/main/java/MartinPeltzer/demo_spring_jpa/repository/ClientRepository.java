package MartinPeltzer.demo_spring_jpa.repository;

import MartinPeltzer.demo_spring_jpa.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {

    Client findByLastNameIgnoreCase(String lastName);
    Client findByClientNr(long clientNr);



}
