package ch.janis.cellar6.repositories;

import ch.janis.cellar6.entities.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository<City,Long> {

}
