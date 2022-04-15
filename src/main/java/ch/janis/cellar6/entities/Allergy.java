package ch.janis.cellar6.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name="Allergy")
@ToString
public class Allergy {

    @Column(name = "allergyId", unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long allergyId;

    @Column(name = "allergyName", nullable = true)
    private String illnessName;
}

