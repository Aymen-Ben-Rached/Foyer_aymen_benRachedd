package com.example.foyerbenrachedaymen.RestControllers;

import com.example.foyerbenrachedaymen.DAO.Entities.Chambre;
import com.example.foyerbenrachedaymen.Services.Interfaces.IChambreService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class ChambreRestController {
    IChambreService iChambreService;

    @GetMapping("getAllChambres")
    public List<Chambre> getAllChambres() {
        return iChambreService.findAllChambres();
    }

    @PostMapping("addChambre")
    public Chambre addChambre(@RequestBody Chambre chambre) {
        return iChambreService.addChambre(chambre);
    }

    @PostMapping("addAllChambres")
    public List<Chambre> addAllChambres(@RequestBody List<Chambre> chambres) {
        return iChambreService.addAllChambres(chambres);
    }
    @GetMapping("getChambreById")
    public Chambre getChambreById(@RequestParam long id) {
        return iChambreService.findChambreById(id);
    }

}
