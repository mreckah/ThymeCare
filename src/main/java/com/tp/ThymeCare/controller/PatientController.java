package com.tp.ThymeCare.controller;

import com.tp.ThymeCare.model.Patient;
import com.tp.ThymeCare.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class PatientController {
    @Autowired
    private PatientService service;

    @GetMapping("/patients")
    public List<Patient> getPatients(){
        return service.getAllPatients();
    }
    @GetMapping("/patients/{id}")
    public Patient getPatientById(@PathVariable int id){
        return service.getPatientById(id);
    }
}
