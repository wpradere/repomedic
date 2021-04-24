package com.medicalrepository.v1.controller;

import com.medicalrepository.v1.entity.CitaMedica;
import com.medicalrepository.v1.repository.CitaMedicaRepository;
import com.medicalrepository.v1.services.CitaMedicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cita-medica/")
public class CitaMedicaController {

    @Autowired
    CitaMedicaService citaMedicaService;

    @GetMapping("/cita/all")
    public List<CitaMedica> findall(){
        return citaMedicaService.findAll();
    }


    @PostMapping("/cita/")
    public CitaMedica saveCuenta (@RequestBody CitaMedica citaMedica){
        citaMedicaService.save(citaMedica);
        return citaMedica;
    }

    @DeleteMapping("/delete-cita/{id}")
    public String delete ( @PathVariable Long id){
        String resp;

        CitaMedica cuentaEntidad= citaMedicaService.findOne(id);
        if (cuentaEntidad !=null){
            citaMedicaService.delete(id);
            resp = "done";
        }else {
            resp = "no exist";
        }
        return resp;
    }

    @PutMapping("/update-cita/")
    public CitaMedica update(@RequestBody CitaMedica cuentaEntidad){
        citaMedicaService.save(cuentaEntidad);
        return  cuentaEntidad;


    }
}
