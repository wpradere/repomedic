package com.medicalrepository.v1.services;

import com.medicalrepository.v1.entity.Medicina;
import com.medicalrepository.v1.entity.Paciente;

import java.util.List;

public interface PacienteService {

    public List<Paciente> findAll();
    public void save (Paciente paciente);
    public void delete(Long id);
    public Paciente findOne(Long id);
}
