package com.example.foyerbenrachedaymen.Services.Classes;

import com.example.foyerbenrachedaymen.DAO.Entities.Universite;
import com.example.foyerbenrachedaymen.DAO.Repositories.UniversiteRepository;
import com.example.foyerbenrachedaymen.Services.Interfaces.IUniversiteService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UniversiteService implements IUniversiteService {
    UniversiteRepository universiteRepository;

    @Override
    public Universite addUniversite(Universite u) {
        return universiteRepository.save(u);
    }

    @Override
    public List<Universite> addAllUniversites(List<Universite> universites) {
        return universiteRepository.saveAll(universites);
    }

    @Override
    public Universite updateUniversite(Universite u) {
        return universiteRepository.save(u);
    }

    @Override
    public List<Universite> findAllUniversites() {
        return universiteRepository.findAll();
    }

    @Override
    public Universite findUniversiteById(long id) {
        return universiteRepository.findById(id).get();
    }

    @Override
    public void deleteUniversite(Universite u) {
        universiteRepository.delete(u);
    }

    @Override
    public void deleteUniversiteById(long id) {
        universiteRepository.deleteById(id);
    }
}
