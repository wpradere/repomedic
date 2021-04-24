package com.medicalrepository.v1.controller;


import com.medicalrepository.v1.entity.SedePaciente;
import com.medicalrepository.v1.services.SedePacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/sede/")
public class SedePacienteController {

    @Autowired
    SedePacienteService sedePacienteService;

    @GetMapping("/sede/all")
    public List<SedePaciente> findall(){
        return sedePacienteService.findAll();
    }


    @PostMapping("/sede/")
    public SedePaciente saveCuenta (@RequestBody SedePaciente sedePaciente){
        sedePacienteService.save(sedePaciente);
        return sedePaciente;
    }

    @DeleteMapping("/delete-sede/{id}")
    public String delete ( @PathVariable Long id){
        String resp;

        SedePaciente cuentaEntidad= sedePacienteService.findOne(id);
        if (cuentaEntidad !=null){
            sedePacienteService.delete(id);
            resp = "done";
        }else {
            resp = "no exist";
        }
        return resp;
    }

    @PutMapping("/update-sede/")
    public SedePaciente update(@RequestBody SedePaciente sedePaciente){
        sedePacienteService.save(sedePaciente);
        return  sedePaciente;


    }
}
