package com.medicalrepository.v1.services;

import com.medicalrepository.v1.entity.Medicina;

import java.util.List;

public interface MedicinaService {

    public List<Medicina> findAll();
    public void save (Medicina cuenta);
    public void delete(Long id);
    public Medicina findOne(Long id);
}
