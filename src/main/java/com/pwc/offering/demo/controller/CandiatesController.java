package com.pwc.offering.demo.controller;

import com.pwc.offering.demo.dto.CandidateDTO;
import com.pwc.offering.demo.model.*;
import com.pwc.offering.demo.service.CandidatesService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Validated
@RestController
@RequestMapping("/candidates")
public class CandiatesController{

    @Autowired
    private CandidatesService candidatesService;

    @GetMapping("/all")
    public ResponseEntity<?> GetAllCandidates(){
        return candidatesService.GetAllCandidates();
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> GetCandidateById(@PathVariable("id") Long id){
        return candidatesService.GetCandidateById(id);
    }

    @PostMapping("/add")
    public ResponseEntity<?> addCandidate(@Valid @RequestBody CandidateDTO candidate, BindingResult result){
        if(result.hasErrors()){
            return ResponseEntity.badRequest().body(result.getFieldError());
        }else{
            Candidate candidate1 = new Candidate();
            BeanUtils.copyProperties(candidate,candidate1);
            candidate1.setId(candidate.getCandidateId());
//            candidate1.setUniversty(candidate.ge);
            candidate1.setCurrentSalary(candidate.getCurrentYearlySalaryNet());
            candidate1.setCurrentNetSalary(candidate.getCurrentNet());
            candidate1.setExpectedGross(candidate.getExpectationGross());
            candidate1.setExpectedNet(candidate.getExpectationNet());
//            candidate1.setOfferedPwcGrade(candidate.getPwcGrade());
//            candidate1.setInternalTitle(candidate.getEticTitle());
            return candidatesService.AddCandidate(candidate1);
        }
    }

    @PutMapping("/edit")
    public ResponseEntity<?> updatedCandidate(@Valid @RequestBody CandidateDTO candidate){
        Candidate candidate1 = new Candidate();
        BeanUtils.copyProperties(candidate,candidate1);
        return candidatesService.EditCandidate(candidate1);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteCandidateById(@PathVariable("id") Long id){
        return candidatesService.DeleteCandidate(id);
    }

}
