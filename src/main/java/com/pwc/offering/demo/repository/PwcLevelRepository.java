package com.pwc.offering.demo.repository;

import com.pwc.offering.demo.model.PwcLevel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PwcLevelRepository extends JpaRepository<PwcLevel,Long> {
}
