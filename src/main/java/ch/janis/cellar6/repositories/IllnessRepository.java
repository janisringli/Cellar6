package ch.janis.cellar6.repositories;


import ch.janis.cellar6.entities.Illness;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IllnessRepository extends JpaRepository<Illness,Long> {

}
