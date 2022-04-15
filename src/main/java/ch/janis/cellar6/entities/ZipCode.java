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
@Table(name="ZipCode")
@ToString
public class ZipCode {

    @Column(name = "zipCodeID", unique = true, nullable = false)
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    @Id
    private UUID addressId;

    @Column(name = "cityIDFS", nullable = true)
    private UUID cityIdfs;

    @Column(name = "zipCode", nullable = true)
    private int zipCode;

}

