package ch.janis.cellar6.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name="City")
@ToString
public class City {

    @Column(name = "cityID", unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long cityID;

    @Column(name = "cityName", nullable = true)
    private String cityName;

    @Column(name = "countryIDFS", nullable = true)
    private Long countryIDFS;
}
