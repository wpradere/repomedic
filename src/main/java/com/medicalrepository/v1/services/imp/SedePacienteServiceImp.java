package com.medicalrepository.v1.services.imp;

import com.medicalrepository.v1.entity.SedePaciente;
import com.medicalrepository.v1.repository.SedeRepository;
import com.medicalrepository.v1.services.SedePacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class SedePacienteServiceImp implements SedePacienteService {
    @Autowired
    private SedeRepository sedeRepository;

    @Override
    public List<SedePaciente> findAll() {
        return sedeRepository.findAll();
    }

    @Override
    public void save(SedePaciente cuenta) {
        sedeRepository.save(cuenta);
    }

    @Override
    public void delete(Long id) {
        SedePaciente sedePaciente = sedeRepository.findAllByIdSedePaciente(id);
        sedeRepository.delete(sedePaciente);

    }

    @Override
    public SedePaciente findOne(Long id) {
        return sedeRepository.findAllByIdSedePaciente(id);
    }
}
