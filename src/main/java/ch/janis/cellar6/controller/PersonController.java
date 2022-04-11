package ch.janis.cellar6.controller;

import ch.janis.cellar6.entities.Person;
import ch.janis.cellar6.repositories.PersonRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/person")
public class PersonController {
    private final PersonRepository personalDataRepository;
    public PersonController(PersonRepository personalDataRepository) {
        this.personalDataRepository = personalDataRepository;
    }

    @GetMapping
    List<Person> getPersonalData() {
        return personalDataRepository.findAll();
    }

    @PostMapping
    Person createTest(@RequestBody Person test) {
        return personalDataRepository.save(test);
    }

}
