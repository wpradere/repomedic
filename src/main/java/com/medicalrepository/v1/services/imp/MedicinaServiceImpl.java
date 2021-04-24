package com.medicalrepository.v1.services.imp;

import com.medicalrepository.v1.entity.Medicina;
import com.medicalrepository.v1.repository.MedicinaRepository;
import com.medicalrepository.v1.services.MedicinaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MedicinaServiceImpl implements MedicinaService {

    @Autowired
    private MedicinaRepository medicinaRepository;

    @Override
    public List<Medicina> findAll() {
        return medicinaRepository.findAll();
    }

    @Override
    public void save(Medicina medicina) {

        medicinaRepository.save(medicina);

    }

    @Override
    public void delete(Long id) {
        Medicina medicina = medicinaRepository.findAllByIdMedicina(id);
        medicinaRepository.delete(medicina);

    }

    @Override
    public Medicina findOne(Long id) {
        return medicinaRepository.findAllByIdMedicina(id);
    }
}
