package com.example.foyerbenrachedaymen.RestControllers;

import com.example.foyerbenrachedaymen.DAO.Entities.Universite;
import com.example.foyerbenrachedaymen.Services.Interfaces.IUniversiteService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class UniversiteRestController {
    IUniversiteService iUniversiteService;

    @GetMapping("getAllUniversites")
    public List<Universite> getAllUniversites() {
        return iUniversiteService.findAllUniversites();
    }

    @GetMapping("getUniversiteById")
    public Universite getUniversiteById(@RequestParam long id) {
        return iUniversiteService.findUniversiteById(id);
    }

    @PostMapping("addUniversite")
    public Universite addUniversite(@RequestBody Universite universite) {
        return iUniversiteService.addUniversite(universite);
    }

    @PostMapping("addAllUniversites")
    public List<Universite> addAllUniversite(@RequestBody List<Universite> universites) {
        return iUniversiteService.addAllUniversites(universites);
    }

}
