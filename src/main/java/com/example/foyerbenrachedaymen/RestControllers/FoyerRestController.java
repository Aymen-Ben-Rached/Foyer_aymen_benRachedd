package com.example.foyerbenrachedaymen.RestControllers;

import com.example.foyerbenrachedaymen.DAO.Entities.Foyer;
import com.example.foyerbenrachedaymen.Services.Interfaces.IFoyerService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class FoyerRestController {
    IFoyerService iFoyerService;

    @GetMapping("getAllFoyer")
    public List<Foyer> getAllFoyers() {
        return iFoyerService.findAllFoyers();
    }

    @GetMapping("getFoyerById")
    public Foyer getFoyerById(@RequestParam long id) {
        return iFoyerService.findFoyerById(id);
    }

    @PostMapping("addFoyer")
    public Foyer addFoyer(@RequestBody Foyer foyer) {
        return iFoyerService.addFoyer(foyer);
    }

    @PostMapping("addAllFoyers")
    public List<Foyer> addAllFoyers(@RequestBody List<Foyer> foyers) {
        return iFoyerService.addAllFoyers(foyers);
    }
}
