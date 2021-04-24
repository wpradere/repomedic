package com.medicalrepository.v1.services.imp;

import com.medicalrepository.v1.entity.CitaMedica;
import com.medicalrepository.v1.repository.CitaMedicaRepository;
import com.medicalrepository.v1.services.CitaMedicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CitaMedicaserviceImp implements CitaMedicaService {

    @Autowired
    private CitaMedicaRepository citaMedicaRepository;

    @Override
    public List<CitaMedica>  findAll() {
        return citaMedicaRepository.findAll();
    }

    @Override
    public void save(CitaMedica citaMedica) {
        citaMedicaRepository.save(citaMedica);
    }

    @Override
    public void delete(Long id) {
        CitaMedica citaMedica = citaMedicaRepository.findAllByIdCirtaMedica(id);
        citaMedicaRepository.delete(citaMedica);

    }

    @Override
    public CitaMedica findOne(Long id) {
        return citaMedicaRepository.findAllByIdCirtaMedica(id);
    }
}
