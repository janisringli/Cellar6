package ch.janis.cellar6.controller;

import ch.janis.cellar6.entities.Person;
import ch.janis.cellar6.repositories.PersonRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/person")
public class PersonController {
    private final PersonRepository personRepository;
    public PersonController(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @GetMapping
    List<Person> getPerson() {
        return personRepository.findAll();
    }

    @PostMapping
    Person createTest(@RequestBody Person test) {
        return personRepository.save(test);
    }

}
