package com.example.foyerbenrachedaymen.Services.Interfaces;

import com.example.foyerbenrachedaymen.DAO.Entities.Foyer;

import java.util.List;

public interface IFoyerService {
    Foyer addFoyer(Foyer f);

    List<Foyer> addAllFoyers(List<Foyer> foyers);

    Foyer updateFoyer(Foyer f);

    List<Foyer> findAllFoyers();

    Foyer findFoyerById(long id);

    void deleteFoyer(Foyer f);

    void deleteFoyerById(long id);
}
