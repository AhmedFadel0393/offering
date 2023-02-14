package com.pwc.offering.demo.repository;

import com.pwc.offering.demo.model.Tower;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TowerRepository extends JpaRepository<Tower,Long> {
}
