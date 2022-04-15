package ch.janis.cellar6.controller;

import ch.janis.cellar6.repositories.IllnessRepository;
import org.hibernate.PropertyValueException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/illness")
public class IllnessController {
    private final IllnessRepository illnessRepository;

    public IllnessController(IllnessRepository illnessRepository) {
        this.illnessRepository = illnessRepository;
    }

    @GetMapping
    List<ch.janis.cellar6.entities.Illness> getIllness() {
        System.out.println("is this the right repo?");
        return illnessRepository.findAll();
    }

    @PostMapping
    ch.janis.cellar6.entities.Illness createTest(@RequestBody ch.janis.cellar6.entities.Illness test) {

        try {
            return illnessRepository.save(test);
        } catch (PropertyValueException e) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "just because");
        }
    }
}
