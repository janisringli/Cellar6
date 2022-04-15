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
@Table(name="Address")
@ToString
public class Address {

    @Column(name = "addressID", unique = true, nullable = false)
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    @Id
    private UUID addressID;


    @Column(name = "zipCodeIDFS", nullable = true) //Foreign key to zipCode FIXME: Foreign key not yet added, change nullable t
    private UUID zipCodeIDFS;

    @Column(name = "address", nullable = true)
    private String address;

    @Column(name = "additionalAddress", nullable = true)
    private String additionalAddress;


}