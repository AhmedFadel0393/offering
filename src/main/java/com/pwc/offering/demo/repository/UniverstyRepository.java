package com.pwc.offering.demo.repository;

import com.pwc.offering.demo.model.Universty;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UniverstyRepository extends JpaRepository<Universty,Long> {
}
