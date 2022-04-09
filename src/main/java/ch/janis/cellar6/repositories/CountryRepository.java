package ch.janis.cellar6.repositories;

import ch.janis.cellar6.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country,Long> {

}
