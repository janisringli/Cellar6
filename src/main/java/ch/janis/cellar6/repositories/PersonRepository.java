package ch.janis.cellar6.repositories;

import ch.janis.cellar6.entities.PersonalData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonalDataRepository extends JpaRepository<PersonalData,Long> {

}
