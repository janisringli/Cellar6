package ch.janis.cellar6.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name="Address")
@ToString
public class Address {

    @Column(name = "addressID", unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long addressID;


    @Column(name = "zipCodeIDFS", nullable = true) //Foreign key to zipCode FIXME: Foreign key not yet added, change nullable t
    private Long zipCodeIDFS;

    @Column(name = "address", nullable = true)
    private String address;

    @Column(name = "additionalAddress", nullable = true)
    private String additionalAddress;


}