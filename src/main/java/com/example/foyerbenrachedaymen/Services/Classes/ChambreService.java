package com.example.foyerbenrachedaymen.Services.Classes;

import com.example.foyerbenrachedaymen.DAO.Entities.Chambre;
import com.example.foyerbenrachedaymen.DAO.Repositories.ChambreRepository;
import com.example.foyerbenrachedaymen.Services.Interfaces.IChambreService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ChambreService implements IChambreService {
    ChambreRepository chambreRepository;

    @Override
    public Chambre addChambre(Chambre c) {
        return chambreRepository.save(c);
    }

    @Override
    public List<Chambre> addAllChambres(List<Chambre> chambres) {
        return chambreRepository.saveAll(chambres);
    }

    @Override
    public Chambre updateChambre(Chambre c) {
        return chambreRepository.save(c);
    }

    @Override
    public List<Chambre> findAllChambres() {
        return chambreRepository.findAll();
    }

    @Override
    public Chambre findChambreById(long id) {
        return chambreRepository.findById(id).get();
    }

    @Override
    public void deleteChambre(Chambre c) {
        chambreRepository.delete(c);
    }

    @Override
    public void deleteChambreById(long id) {
        chambreRepository.deleteById(id);
    }
}
