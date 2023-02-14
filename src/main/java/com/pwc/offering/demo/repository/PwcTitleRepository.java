package com.pwc.offering.demo.repository;

import com.pwc.offering.demo.model.PwcTitle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PwcTitleRepository extends JpaRepository<PwcTitle,Long> {
}
