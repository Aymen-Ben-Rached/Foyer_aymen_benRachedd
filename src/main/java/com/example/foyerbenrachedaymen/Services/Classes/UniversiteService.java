package com.example.foyerbenrachedaymen.Services.Classes;

import com.example.foyerbenrachedaymen.DAO.Repositories.UniversiteRepository;
import com.example.foyerbenrachedaymen.Services.Interfaces.IUniversiteService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UniversiteService implements IUniversiteService {
    UniversiteRepository universiteRepository;
}
