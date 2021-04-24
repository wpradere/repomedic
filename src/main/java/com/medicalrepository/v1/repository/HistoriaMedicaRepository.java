package com.medicalrepository.v1.repository;

import com.medicalrepository.v1.entity.HistoriaMedica;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface HistoriaMedicaRepository extends CrudRepository<HistoriaMedica,Long> {

    public List<HistoriaMedica> findAll();
    public HistoriaMedica findAllByIdHistoriaMedica (Long id);
}
