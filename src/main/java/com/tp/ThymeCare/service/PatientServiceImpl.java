package com.tp.ThymeCare.service;

import com.tp.ThymeCare.model.Patient;
import com.tp.ThymeCare.repository.PatientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientServiceImpl implements PatientService {
    @Autowired
    private PatientRepo repo;

    @Override
    public List<Patient> getAllPatients(){
        return repo.findAll();
    }
    @Override
    public Patient getPatientById(int id){
        return repo.findById(id).orElse(null);
    }
    @Override
    public Patient addPatient(Patient patient){
        return repo.save(patient);
    }
    @Override
    public Patient updatePatient(Patient patient){
        return repo.save(patient);
    }
    @Override
    public void deletePatient(int id){
        Patient patient = repo.findById(id).orElse(null);
        repo.delete(patient);
    }

}
