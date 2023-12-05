package com.example.foyerbenrachedaymen.Services.Classes;

import com.example.foyerbenrachedaymen.DAO.Entities.Bloc;
import com.example.foyerbenrachedaymen.DAO.Repositories.BlocRepository;
import com.example.foyerbenrachedaymen.Services.Interfaces.IBlocService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service //Definir que cest un bean spring
@AllArgsConstructor //Pour injecter un bean spring dans un autre bean
public class BlocService implements IBlocService {


    //save: Ajout et modification
    //--> Id
    //> L'objet contient un id qui existe dans la BD=>Modification
    //> L'objet ne contient pas un id(null) ou l'objet conitient un id qui n'existe pas dans la BD =>Ajout


    BlocRepository blocRepository;

    @Override
    public Bloc addBloc(Bloc b) {
        return blocRepository.save(b);
    }

    @Override
    public List<Bloc> addAllBlocs(List<Bloc> blocs) {
        return blocRepository.saveAll(blocs);
    }

    @Override
    public Bloc updateBloc(Bloc b) {
        return blocRepository.save(b);
    }

    @Override
    public List<Bloc> findAllBlocs() {
        return blocRepository.findAll();
    }

    @Override
    public Bloc findBlocById(long id) {
        //return blocRepository.findById(id).get();
        return blocRepository.findById(id).orElse(Bloc.builder().idBloc(0).build());
    }

    @Override
    public void deleteBloc(Bloc b) {
        blocRepository.delete(b);
    }

    @Override
    public void deleteBlocById(long id) {
        blocRepository.deleteById(id);
    }
}
