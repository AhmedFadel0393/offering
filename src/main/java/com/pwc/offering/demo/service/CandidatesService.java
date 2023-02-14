package com.pwc.offering.demo.service;

import com.pwc.offering.demo.model.Candidate;
import com.pwc.offering.demo.repository.CandidateRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CandidatesService {

    //Logging
    Logger logger = LoggerFactory.getLogger(CandidatesService.class);

    //Replaced by DB
    static List<Candidate> allCandidates = new ArrayList<>();

    @Autowired
    private CandidateRepository repository;

    public ResponseEntity<?> GetAllCandidates(){
        logger.info("Fetching all Candidates");
        return ResponseEntity.ok().body(repository.findAll());
    }

    public ResponseEntity<?> GetCandidateById(Long id){
        logger.info("Fetching Candidate : "+id);
        return ResponseEntity.ok(repository.findById(id));
    }

    public ResponseEntity<?> AddCandidate(Candidate candidate){
        try{
            logger.info("Adding Candidate : with Id:"+candidate.getId());
            Optional<Candidate> candidateExists = repository.findById(candidate.getId());
            if(candidateExists.isPresent()){
                logger.info("Adding Candidate : with Id:"+candidate.getId()+" failed as candidate already exists");
                return ResponseEntity.badRequest().body("Candidate with id :"+candidate.getId()+" already exists");
            }else{
                repository.save(candidate);
                logger.info("Adding Candidate : with Id:"+candidate.getId()+" added successfully");
                return ResponseEntity.ok().body("Candidate added successfully");
            }
        }catch (Exception e){
            logger.error(e.getMessage());
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }

    public ResponseEntity<?> EditCandidate(Candidate candidate){
        try{
            logger.info("Editing Candidate : with Id:"+candidate.getId());
            Optional<Candidate> candidateExists = repository.findById(candidate.getId());
            if(!candidateExists.isPresent()){
                logger.info("Editing Candidate : with Id:"+candidate.getId()+" failed as candidate does not exist");
                return ResponseEntity.badRequest().body("Candidate with id :"+candidate.getId()+" does not exist");
            }else{
                repository.deleteById(candidate.getId());
                repository.save(candidate);
                logger.info("Editing Candidate : with Id:"+candidate.getId()+" modified successfully");
                return ResponseEntity.ok().body("Candidate modified successfully");
            }
        }catch (Exception e){
            logger.error(e.getMessage());
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }

    public ResponseEntity<?> DeleteCandidate(Long id){
        try{
            logger.info("Deleting Candidate : with Id:"+id);
            Optional<Candidate> candidateExists = repository.findById(id);
            if(!candidateExists.isPresent()){
                logger.info("Deleting Candidate : with Id:"+id+" failed as candidate does not exist");
                return ResponseEntity.badRequest().body("Candidate with id :"+id+" does not exist");
            }else{
                repository.deleteById(id);
                logger.info("Deleting Candidate : with Id:"+id+" removed successfully");
                return ResponseEntity.ok().body("Candidate removed successfully");
            }
        }catch (Exception e){
            logger.error(e.getMessage());
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }
}
