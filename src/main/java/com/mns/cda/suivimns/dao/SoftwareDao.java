package com.mns.cda.suivimns.dao;

import com.mns.cda.suivimns.model.Software;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SoftwareDao extends JpaRepository<Software, Integer> {
}
