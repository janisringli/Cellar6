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
@Table(name="City")
@ToString
public class City {

    @Column(name = "cityID", unique = true, nullable = false)
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    @Id
    private UUID cityID;

    @Column(name = "cityName", nullable = true)
    private String cityName;

    @Column(name = "countryIDFS", nullable = true)
    private UUID countryIDFS;
}
