package ch.janis.cellar6.repositories;

import ch.janis.cellar6.entities.Allergy;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AllergyRepository extends JpaRepository<Allergy,Long> {

}
