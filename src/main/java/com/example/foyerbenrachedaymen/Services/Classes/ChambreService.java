package com.example.foyerbenrachedaymen.Services.Classes;

import com.example.foyerbenrachedaymen.DAO.Repositories.ChambreRepository;
import com.example.foyerbenrachedaymen.Services.Interfaces.IChambreService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ChambreService implements IChambreService {
    ChambreRepository chambreRepository;
}
