package ch.janis.cellar6.repositories;

import ch.janis.cellar6.entities.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address,Long> {

}
