package ch.janis.cellar6.controller;

import ch.janis.cellar6.repositories.AllergyRepository;
import org.springframework.web.bind.annotation.*;


import java.util.List;

public class AllergyController {
    private final AllergyRepository allergyRepository;

    public AllergyController(AllergyRepository allergyRepository) {
        this.allergyRepository = allergyRepository;
    }

    @GetMapping("/allergy")
    List<ch.janis.cellar6.entities.Allergy> getAllergy() {
        System.out.println("is this the right repo?");
        return allergyRepository.findAll();
    }

    @PostMapping
    ch.janis.cellar6.entities.Allergy createTest(@RequestBody ch.janis.cellar6.entities.Allergy test) {
        return allergyRepository.save(test);
    }
}