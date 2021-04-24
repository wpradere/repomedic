package com.medicalrepository.v1.controller;


import com.medicalrepository.v1.entity.HistoriaMedica;
import com.medicalrepository.v1.services.CitaMedicaService;
import com.medicalrepository.v1.services.HistoryaMedicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/historia-medica/")
public class HistoriaMedicaController {

    @Autowired
    private HistoryaMedicaService historyaMedicaService;

    @GetMapping("/historia/all")
    public List<HistoriaMedica> findall(){
        return historyaMedicaService.findAll();
    }


    @PostMapping("/historia/")
    public HistoriaMedica saveCuenta (@RequestBody HistoriaMedica historiaMedica){
        historyaMedicaService.save(historiaMedica);
        return historiaMedica;
    }

    @DeleteMapping("/delete-historia/{id}")
    public String delete ( @PathVariable Long id){
        String resp;

        HistoriaMedica historiaMedica= historyaMedicaService.findOne(id);
        if (historiaMedica !=null){
            historyaMedicaService.delete(id);
            resp = "done";
        }else {
            resp = "no exist";
        }
        return resp;
    }

    @PutMapping("/update-cita/")
    public HistoriaMedica update(@RequestBody HistoriaMedica historiaMedica){
        historyaMedicaService.save(historiaMedica);
        return  historiaMedica;


    }
}
