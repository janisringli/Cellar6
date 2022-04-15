package ch.janis.cellar6.repositories;

import ch.janis.cellar6.entities.Vitals;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VitalsRepository extends JpaRepository<Vitals,Long> {

}
