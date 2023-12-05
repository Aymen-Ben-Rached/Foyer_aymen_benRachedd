package com.example.foyerbenrachedaymen.Services.Classes;

import com.example.foyerbenrachedaymen.DAO.Entities.Foyer;
import com.example.foyerbenrachedaymen.DAO.Repositories.FoyerRepository;
import com.example.foyerbenrachedaymen.Services.Interfaces.IFoyerService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class FoyerService implements IFoyerService {
    FoyerRepository foyerRepository;

    @Override
    public Foyer addFoyer(Foyer f) {
        return foyerRepository.save(f);
    }

    @Override
    public List<Foyer> addAllFoyers(List<Foyer> foyers) {
        return foyerRepository.saveAll(foyers);
    }

    @Override
    public Foyer updateFoyer(Foyer f) {
        return foyerRepository.save(f);
    }

    @Override
    public List<Foyer> findAllFoyers() {
        return foyerRepository.findAll();
    }

    @Override
    public Foyer findFoyerById(long id) {
        return foyerRepository.findById(id).get();
    }

    @Override
    public void deleteFoyer(Foyer f) {
        foyerRepository.delete(f);
    }

    @Override
    public void deleteFoyerById(long id) {
        foyerRepository.deleteById(id);
    }
}
