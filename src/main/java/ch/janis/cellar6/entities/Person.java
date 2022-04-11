package ch.janis.cellar6.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name="Person")
@ToString
public class Person {

    @Column(name = "personId", unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long personId;

    @Column(name = "firstName", nullable = true)
    private String firstName;

    @Column(name = "lastName", nullable = true)
    private String lastName;

    @Column(name = "birthday", nullable = true)
    private String birthday;

    @Column(name = "telephone", nullable = true)
    private String telefon;

    @Column(name = "email", nullable = true)
    private String email;


}
