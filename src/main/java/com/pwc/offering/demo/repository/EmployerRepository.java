package com.pwc.offering.demo.repository;

import com.pwc.offering.demo.model.Employer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployerRepository extends JpaRepository<Employer,Long> {
}
