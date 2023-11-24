package com.example.foyerbenrachedaymen.Services.Classes;

import com.example.foyerbenrachedaymen.DAO.Repositories.FoyerRepository;
import com.example.foyerbenrachedaymen.Services.Interfaces.IFoyerService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class FoyerService implements IFoyerService {
    FoyerRepository foyerRepository;
}
