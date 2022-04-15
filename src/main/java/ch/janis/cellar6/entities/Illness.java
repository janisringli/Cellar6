package ch.janis.cellar6.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name="Illness")
@ToString
public class Illness {

    @Column(name = "illnessId", unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long illnessId;

    @Column(name = "illnessName", nullable = true)
    private String illnessName;
}
