package com.wf.appstatus.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wf.appstatus.springboot.model.Software;

@Repository
public interface SoftwareRepository extends JpaRepository<Software, Long> {

}
