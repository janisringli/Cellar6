package ch.janis.cellar6.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name="Vitals")
@ToString
public class Vitals {

    @Column(name = "vitalsId", unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long vitalsId;

    @Column(name = "BloodType", nullable = true)
    private String bloodType;

    @Column(name = "AllergiesIdfs", nullable = true)
    private String allergiesIdfs;

    @Column(name = "IllnessIdfs", nullable = true)
    private String illnessIdfs;
}

