package com.medicalrepository.v1.services;

import com.medicalrepository.v1.entity.HistoriaMedica;

import java.util.List;

public interface HistoryaMedicaService {

    public List<HistoriaMedica> findAll();
    public void save (HistoriaMedica cuenta);
    public void delete(Long id);
    public HistoriaMedica findOne(Long id);
}
