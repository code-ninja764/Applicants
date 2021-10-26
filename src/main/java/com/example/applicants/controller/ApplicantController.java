package com.example.applicants.controller;

import com.example.applicants.model.Applicant;
import com.example.applicants.service.ApplicantService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ApplicantController {

    private final ApplicantService service;

    public ApplicantController(ApplicantService service) {
        this.service = service;
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/applicants")
    List<Applicant> getAllApplicants() {
        return service.getAllApplicants();
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping("/applicants")
    Applicant save(@RequestBody Applicant applicant) {
        return service.save(applicant);
    }//POST

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/applicants/id")
    Optional<Applicant> getSingleApplicant(@RequestParam Long id) {
        return service.getSingleApplicant(id);
    } //GET

    @CrossOrigin(origins = "http://localhost:3000")
    @DeleteMapping("/applicants")
    void deleteSingleApplicant(@RequestParam Long id) {
         service.deleteSingleApplicant(id);
    } //DELETE

    @CrossOrigin(origins = "http://localhost:3000")
    @PutMapping("/applicants")
    void updateAPhoneNumber(@RequestParam Long id, @RequestParam String telephoneNumber) {
        service.updateNumber(id, telephoneNumber);
    }//UPDATE telephoneNumber

}
