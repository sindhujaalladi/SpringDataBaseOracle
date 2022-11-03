package com.springoracledb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springoracledb.Entity.projectDetails;

@Repository
public interface projectRepository  extends JpaRepository<projectDetails,Integer>{

}
