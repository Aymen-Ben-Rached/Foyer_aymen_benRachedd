package com.example.foyerbenrachedaymen.RestControllers;

import com.example.foyerbenrachedaymen.DAO.Entities.Bloc;
import com.example.foyerbenrachedaymen.DAO.Entities.Etudiant;
import com.example.foyerbenrachedaymen.Services.Interfaces.IBlocService;
import com.example.foyerbenrachedaymen.Services.Interfaces.IEtudiantService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class EtudiantRestController {
    IEtudiantService iEtudiantService;

    @GetMapping("getAllEtudiant")
    public List<Etudiant> getAllEtudiants() {
        return iEtudiantService.findAllEtudiants();
    }

    @GetMapping("getEtudiantById")
    public Etudiant getEtudiantById(@RequestParam long id) {
        return iEtudiantService.findEtudiantById(id);
    }

    @PostMapping("addEtudiant")
    public Etudiant addEtudiant(@RequestBody Etudiant etudiant) {
        return iEtudiantService.addEtudiant(etudiant);
    }

    @PostMapping("addAllEtudiants")
    public List<Etudiant> addAllEtudiants(@RequestBody List<Etudiant> etudiants) {
        return iEtudiantService.addAllEtudiants(etudiants);
    }
}
