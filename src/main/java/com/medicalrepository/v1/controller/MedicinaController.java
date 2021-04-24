package com.medicalrepository.v1.controller;



import com.medicalrepository.v1.entity.Medicina;
import com.medicalrepository.v1.services.MedicinaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/medicina/")

public class MedicinaController {


    @Autowired
    MedicinaService medicinaService;

    @GetMapping("/medicina/all")
    public List<Medicina> findall(){
        return medicinaService.findAll();
    }


    @PostMapping("/medicina/")
    public Medicina saveCuenta (@RequestBody Medicina medicina){
        medicinaService.save(medicina);
        return medicina;
    }

    @DeleteMapping("/delete-medicina/{id}")
    public String delete ( @PathVariable Long id){
        String resp;

        Medicina cuentaEntidad= medicinaService.findOne(id);
        if (cuentaEntidad !=null){
            medicinaService.delete(id);
            resp = "done";
        }else {
            resp = "no exist";
        }
        return resp;
    }

    @PutMapping("/update-medicina/")
    public Medicina update(@RequestBody Medicina medicina){
        medicinaService.save(medicina);
        return  medicina;


    }
}
