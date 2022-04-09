package ch.janis.cellar6.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name="PersonalData")
@ToString
public class PersonalData {

    @Column(name = "personID", unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long uuid;

    @Column(name = "firstName", nullable = true)
    private String firstName;

    @Column(name = "lastName", nullable = true)
    private String lastName;

    @Column(name = "birthday", nullable = true)
    private String birthday;

    @Column(name = "telefon", nullable = true)
    private String telefon;

    @Column(name = "email", nullable = true)
    private String email;


}
