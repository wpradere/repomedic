package com.medicalrepository.v1.repository;

import com.medicalrepository.v1.entity.CitaMedica;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CitaMedicaRepository extends CrudRepository <CitaMedica,Long> {

    public List<CitaMedica> findAll();
    public CitaMedica findAllByIdCirtaMedica(Long id);


}
