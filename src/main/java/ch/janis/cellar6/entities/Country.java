package ch.janis.cellar6.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name="Country")
@ToString
public class Country {

    @Column(name = "countryID", unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long countryID;

    @Column(name = "countryName", nullable = true)
    private String countryName;
}
