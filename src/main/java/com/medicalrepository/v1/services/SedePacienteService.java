package com.medicalrepository.v1.services;

import com.medicalrepository.v1.entity.SedePaciente;

import java.util.List;

public interface SedePacienteService {

    public List<SedePaciente> findAll();
    public void save (SedePaciente cuenta);
    public void delete(Long id);
    public SedePaciente findOne(Long id);
}
