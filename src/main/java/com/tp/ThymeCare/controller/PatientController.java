package com.tp.ThymeCare.controller;

import com.tp.ThymeCare.model.Patient;
import com.tp.ThymeCare.repository.PatientRepo;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@AllArgsConstructor
public class  PatientController{
    @Autowired
    PatientRepo repo;

    @GetMapping("/user/index")
    public String index(Model model,
                        @RequestParam(name="page",defaultValue = "0") int p,
                        @RequestParam(name="size",defaultValue = "6") int s,
                        @RequestParam(name="keyword",defaultValue = "")String kw
    )
    {
        Page<Patient> page = repo.findByNameContains(kw,PageRequest.of(p,s));
        model.addAttribute("patients", page.getContent());
        model.addAttribute("pages",new int[page.getTotalPages()]);
        model.addAttribute("currentPage",p);
        model.addAttribute("keyword",kw);
        return "patients";
    }
    @GetMapping("/admin/delete")
    public String delete(int id){
        repo.deleteById(id);
        return "redirect:/user/index";
    }
    @GetMapping("/")
    public String home(){
        return "redirect:/user/index";
    }
    @GetMapping("/admin/form")
    public String formPatient(Model model){
        model.addAttribute("patient", new Patient());
        return "form";
    }
    @PostMapping("/admin/save")
    public String save(Model model, Patient patient) {
            repo.save(patient);
        return "redirect:/user/index";
    }


    @GetMapping("/admin/edit/{id}")
    public String edit(Model model, @PathVariable("id") int id) {
        Patient patient = repo.findById(id).orElse(null);
        if (patient != null) {
            model.addAttribute("patient", patient);
            return "edit";
        }
        return "redirect:/user/index";
    }
}
