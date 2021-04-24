package com.medicalrepository.v1.repository;


import com.medicalrepository.v1.entity.Medicina;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MedicinaRepository extends CrudRepository<Medicina,Long> {

    public List<Medicina> findAll();
    public Medicina findAllByIdMedicina (Long id);
}
