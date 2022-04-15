package ch.janis.cellar6.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Getter
@Setter
@Table(name="Person")
@ToString
public class Person {

    @Column(name = "personId", unique = true, nullable = false)
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    @Id
    private UUID personId;

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
