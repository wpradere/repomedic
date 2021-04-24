package com.medicalrepository.v1.services;

import com.medicalrepository.v1.entity.CitaMedica;

import java.util.List;

public interface CitaMedicaService {

    public List<CitaMedica> findAll();
    public void save (CitaMedica citaMedica);
    public void delete(Long id);
    public CitaMedica findOne(Long id);
}
