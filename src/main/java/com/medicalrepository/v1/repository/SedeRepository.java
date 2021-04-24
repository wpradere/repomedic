package com.medicalrepository.v1.repository;

import com.medicalrepository.v1.entity.SedePaciente;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SedeRepository  extends CrudRepository<SedePaciente,Long> {

    public List<SedePaciente> findAll();
    public SedePaciente findAllByIdSedePaciente (Long id);
}
