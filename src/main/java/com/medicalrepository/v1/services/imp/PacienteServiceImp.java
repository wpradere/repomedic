package com.medicalrepository.v1.services.imp;

import com.medicalrepository.v1.entity.Medicina;
import com.medicalrepository.v1.entity.Paciente;
import com.medicalrepository.v1.repository.PacienteRepository;
import com.medicalrepository.v1.services.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PacienteServiceImp implements PacienteService {

    @Autowired
    private PacienteRepository pacienteRepository;

    @Override
    public List<Paciente> findAll() {
        return pacienteRepository.findAll();
    }

    @Override
    public void save(Paciente paciente) {
        pacienteRepository.save(paciente);

    }

    @Override
    public void delete(Long id) {
        Paciente paciente= pacienteRepository.findAllByIdPaciente(id);
        pacienteRepository.delete(paciente);


    }

    @Override
    public Paciente findOne(Long id) {
        return pacienteRepository.findAllByIdPaciente(id);
    }
}
