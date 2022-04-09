package ch.janis.cellar6.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name="ZipCode")
@ToString
public class ZipCode {

    @Column(name = "zipCodeID", unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long addressID;

    @Column(name = "cityIDFS", nullable = true)
    private Long cityIDFS;

    @Column(name = "zipCode", nullable = true)
    private int zipCode;

}

