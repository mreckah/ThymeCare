package com.tp.ThymeCare.controller;

import com.tp.ThymeCare.model.Patient;
import com.tp.ThymeCare.repository.PatientRepo;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@AllArgsConstructor
public class  PatientController{
    PatientRepo repo;

    @GetMapping("/index")
    public String index(Model model,
                        @RequestParam(name="page",defaultValue = "0") int p,
                        @RequestParam(name="size",defaultValue = "4") int s,
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
    @GetMapping("/delete")
    public String delete(int id){
        repo.deleteById(id);
        return "redirect:/index";
                //?page="+p+"&keyword="+kw;
    }
    @GetMapping("/")
    public String home(){
        return "redirect:/index";
    }
    @GetMapping("/form")
    public String formPatient(Model model){
        model.addAttribute("patient", new Patient());
        return "form";
    }
}
