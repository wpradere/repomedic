package com.medicalrepository.v1.repository;

import com.medicalrepository.v1.entity.Medicina;
import com.medicalrepository.v1.entity.Paciente;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PacienteRepository extends CrudRepository<Paciente,Long> {

    public List<Paciente> findAll();
    public Paciente findAllByIdPaciente(Long id);
}
