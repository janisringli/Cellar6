package ch.janis.cellar6.controller;

import ch.janis.cellar6.repositories.PersonalDataRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/personalData")
public class PersonalDataController {
    private final PersonalDataRepository personalDataRepository;
    public PersonalDataController(PersonalDataRepository personalDataRepository) {
        this.personalDataRepository = personalDataRepository;
    }

    @GetMapping
    List<ch.janis.cellar6.entities.PersonalData> getPersonalData() {
        System.out.println("is this the right repo?");
        return personalDataRepository.findAll();
    }

    @PostMapping
    ch.janis.cellar6.entities.PersonalData createTest(@RequestBody ch.janis.cellar6.entities.PersonalData test) {
        return personalDataRepository.save(test);
    }

}
