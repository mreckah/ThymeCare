package com.tp.ThymeCare.controller;

import com.tp.ThymeCare.model.Patient;
import com.tp.ThymeCare.service.PatientService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/patients")
public class PatientController {

    private final PatientService patientService;

    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }

    @GetMapping("/new")
    public String showPatientForm(Model model) {
        model.addAttribute("patient", new Patient());
        return "create";
    }

    @GetMapping
    public String showPatientList(Model model) {
        List<Patient> patients = patientService.getAllPatients();
        model.addAttribute("patients", patients);
        return "index";
    }

    @PostMapping("/new")
    public String submitPatientForm(@Valid @ModelAttribute Patient patient, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "create";
        }
        patientService.addPatient(patient);
        return "redirect:/patients";
    }
    @PutMapping("/{id}")
    public String updatePatient(@PathVariable @Valid @ModelAttribute Patient patient, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "create";
        }
        patientService.updatePatient(patient);
        return "redirect:/patients";
    }
    @DeleteMapping("/{id}")
    public String deletePatient(@PathVariable int id) {
        patientService.deletePatient(id);
        return "redirect:/patients";
    }
}
