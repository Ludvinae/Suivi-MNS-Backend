package com.mns.cda.suivimns.dao;

import com.mns.cda.suivimns.model.Urgency;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UrgencyDao extends JpaRepository<Urgency, Integer> {
}
