package com.medicalrepository.v1.controller;



import com.medicalrepository.v1.entity.Paciente;
import com.medicalrepository.v1.services.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/paciente/")
public class PacienteController {


    @Autowired
    PacienteService pacienteService;

    @GetMapping("/paciente/all")
    public List<Paciente> findall(){
        return pacienteService.findAll();
    }


    @PostMapping("/paciente/")
    public Paciente saveCuenta (@RequestBody Paciente paciente){
        pacienteService.save(paciente);
        return paciente;
    }

    @DeleteMapping("/delete-paciente/{id}")
    public String delete ( @PathVariable Long id){
        String resp;

        Paciente pacienteEntidad = pacienteService.findOne(id);
        if (pacienteEntidad !=null){
            pacienteService.delete(id);
            resp = "done";
        }else {
            resp = "no exist";
        }
        return resp;
    }

    @PutMapping("/update-paciente/")
    public Paciente update(@RequestBody Paciente paciente){
        pacienteService.save(paciente);
        return  paciente;


    }
}
