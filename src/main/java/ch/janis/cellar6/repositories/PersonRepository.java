package ch.janis.cellar6.repositories;

import ch.janis.cellar6.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person,Long> {

}
