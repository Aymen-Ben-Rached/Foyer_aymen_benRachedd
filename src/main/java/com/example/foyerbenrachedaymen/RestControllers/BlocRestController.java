package com.example.foyerbenrachedaymen.RestControllers;

import com.example.foyerbenrachedaymen.DAO.Entities.Bloc;
import com.example.foyerbenrachedaymen.Services.Interfaces.IBlocService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class BlocRestController {
    IBlocService iBlocService;

    @GetMapping("getAllBlocs")
    public List<Bloc> getAllBlocs() {
        return iBlocService.findAllBlocs();
    }

    @PostMapping("addBloc")
    public Bloc addBloc(@RequestBody Bloc b) {
        return iBlocService.addBloc(b);
    }

    @PostMapping("addAllBlocs")
    public List<Bloc> addAllBlocs(@RequestBody List<Bloc> blocs) {
        return iBlocService.addAllBlocs(blocs);
    }

    @GetMapping("getBlocById")
    public Bloc getBlocById(@RequestParam long id) {
        return iBlocService.findBlocById(id);
    }

    @GetMapping("getByIdP/{id}")
    public Bloc getBlocByIdP(@PathVariable long id) {
        return iBlocService.findBlocById(id);
    }
}