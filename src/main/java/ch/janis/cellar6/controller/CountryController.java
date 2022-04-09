package ch.janis.cellar6.controller;

import ch.janis.cellar6.repositories.CountryRepository;
import org.hibernate.PropertyValueException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/country")
public class CountryController {
    private final CountryRepository countryRepository;
    public CountryController(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    @GetMapping
    List<ch.janis.cellar6.entities.Country> getZipCode() {
        System.out.println("is this the right repo?");
        return countryRepository.findAll();
    }

    @PostMapping
    ch.janis.cellar6.entities.Country createTest(@RequestBody ch.janis.cellar6.entities.Country test) {

        try {
            return countryRepository.save(test);
        } catch(PropertyValueException e) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST,"just because");
        }
    }

}

