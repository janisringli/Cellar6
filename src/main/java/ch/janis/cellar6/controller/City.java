package ch.janis.cellar6.controller;

import ch.janis.cellar6.repositories.CityRepository;
import org.springframework.web.bind.annotation.*;


import java.util.List;

public class City {
    private final CityRepository cityRepository;

    public City(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    @GetMapping("/city")
    List<ch.janis.cellar6.entities.City> getCity() {
        System.out.println("is this the right repo?");
        return cityRepository.findAll();
    }

    @PostMapping
    ch.janis.cellar6.entities.City createTest(@RequestBody ch.janis.cellar6.entities.City test) {
        return cityRepository.save(test);
    }
}
