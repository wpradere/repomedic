package com.medicalrepository.v1.services.imp;

import com.medicalrepository.v1.entity.HistoriaMedica;
import com.medicalrepository.v1.repository.HistoriaMedicaRepository;
import com.medicalrepository.v1.services.HistoryaMedicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class HistoriaMedicaServiceImp implements HistoryaMedicaService {

    @Autowired
    private HistoriaMedicaRepository historiaMedicaRepository;
    @Override
    public List<HistoriaMedica> findAll() {
        return historiaMedicaRepository.findAll();
    }

    @Override
    public void save(HistoriaMedica historiaMedica) {
        historiaMedicaRepository.save(historiaMedica);

    }

    @Override
    public void delete(Long id) {
        HistoriaMedica historiaMedica = historiaMedicaRepository.findAllByIdHistoriaMedica(id);
        historiaMedicaRepository.delete(historiaMedica);

    }

    @Override
    public HistoriaMedica findOne(Long id) {
        return historiaMedicaRepository.findAllByIdHistoriaMedica(id);
    }
}
