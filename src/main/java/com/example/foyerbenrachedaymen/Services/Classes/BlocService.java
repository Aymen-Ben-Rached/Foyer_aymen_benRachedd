package com.example.foyerbenrachedaymen.Services.Classes;

import com.example.foyerbenrachedaymen.DAO.Repositories.BlocRepository;
import com.example.foyerbenrachedaymen.Services.Interfaces.IBlocService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service //Definir que cest un bean spring
@AllArgsConstructor //Pour injecter un bean spring dans un autre bean
public class BlocService implements IBlocService {

    BlocRepository blocRepository;

}
