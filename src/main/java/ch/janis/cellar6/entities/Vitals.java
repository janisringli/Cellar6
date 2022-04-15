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
@Table(name="Vitals")
@ToString
public class Vitals {

    @Column(name = "vitalsId", unique = true, nullable = false)
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    @Id
    private UUID vitalsId;

    @Column(name = "BloodType", nullable = true)
    private String bloodType;

    @Column(name = "AllergyIdfs", nullable = true)
    private UUID allergyIdfs;

    @Column(name = "IllnessIdfs", nullable = true)
    private UUID illnessIdfs;
}

