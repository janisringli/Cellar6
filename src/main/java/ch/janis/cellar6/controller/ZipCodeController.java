package ch.janis.cellar6.controller;

import ch.janis.cellar6.repositories.ZipCodeRepository;
import org.hibernate.PropertyValueException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/zipCode")
public class ZipCodeController {
    private final ZipCodeRepository zipCodeRepository;

    public ZipCodeController(ZipCodeRepository zipCodeRepository) {
        this.zipCodeRepository = zipCodeRepository;
    }

    @GetMapping
    List<ch.janis.cellar6.entities.ZipCode> getZipCode() {
        System.out.println("is this the right repo?");
        return zipCodeRepository.findAll();
    }

    @PostMapping
    ch.janis.cellar6.entities.ZipCode createTest(@RequestBody ch.janis.cellar6.entities.ZipCode test) {

        try {
            return zipCodeRepository.save(test);
        } catch (PropertyValueException e) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "just because");
        }
    }
}
