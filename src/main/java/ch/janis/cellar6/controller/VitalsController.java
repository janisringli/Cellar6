package ch.janis.cellar6.controller;

import ch.janis.cellar6.entities.Vitals;
import ch.janis.cellar6.repositories.VitalsRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/Vitals")
public class VitalsController {
    private final VitalsRepository vitalsRepository;
    public VitalsController(VitalsRepository vitalsRepository) {
        this.vitalsRepository = vitalsRepository;
    }

    @GetMapping
    List<Vitals> getVitals() {
        return vitalsRepository.findAll();
    }

    @PostMapping
    Vitals createTest(@RequestBody Vitals test) {
        return vitalsRepository.save(test);
    }

}

