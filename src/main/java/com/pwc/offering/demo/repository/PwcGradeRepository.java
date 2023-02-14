package com.pwc.offering.demo.repository;

import com.pwc.offering.demo.model.PwcGrade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PwcGradeRepository extends JpaRepository<PwcGrade,Long> {
}
