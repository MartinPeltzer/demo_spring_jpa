package MartinPeltzer.demo_spring_jpa.model;

import javax.persistence.*;
//in de browser: "localhost:8080/h2console" -->Kom je bij de H2-databse
//username "sa" password: "password" -->connect klikken.

@Entity
@Table(name = "client")

public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //(verhoogt Id steeds met 1)
    private long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "client_nr")
    private String clientNr;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getClientNr() {
        return clientNr;
    }

    public void setClientNr(String clientNr) {
        this.clientNr = clientNr;
    }
}
