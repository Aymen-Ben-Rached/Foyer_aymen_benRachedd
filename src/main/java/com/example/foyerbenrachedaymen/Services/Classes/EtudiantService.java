package com.example.foyerbenrachedaymen.Services.Classes;

import com.example.foyerbenrachedaymen.DAO.Repositories.EtudiantRepository;
import com.example.foyerbenrachedaymen.Services.Interfaces.IEtudiantService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EtudiantService implements IEtudiantService {
    EtudiantRepository etudiantRepository;
}
