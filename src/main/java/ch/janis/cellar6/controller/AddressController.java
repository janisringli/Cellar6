package ch.janis.cellar6.controller;

import ch.janis.cellar6.repositories.AddressRepository;
import org.springframework.web.bind.annotation.*;


import java.util.List;

public class AddressController {
    private final AddressRepository addressRepository;
    public AddressController(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    @GetMapping
    List<ch.janis.cellar6.entities.Address> getAddress() {
        System.out.println("is this the right repo?");
        return addressRepository.findAll();
    }

    @PostMapping
    ch.janis.cellar6.entities.Address createTest(@RequestBody ch.janis.cellar6.entities.Address test) {
        return addressRepository.save(test);
    }

}
