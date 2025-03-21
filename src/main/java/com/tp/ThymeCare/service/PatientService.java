package com.tp.ThymeCare.service;

import com.tp.ThymeCare.model.Patient;
import org.springframework.stereotype.Service;

import java.util.List;

public interface PatientService {

    List<Patient> getAllPatients();

    Patient getPatientById(int id);

    Patient addPatient(Patient patient);

    Patient updatePatient(Patient patient);

    void deletePatient(int id);
}
