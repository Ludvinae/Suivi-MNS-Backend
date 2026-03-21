package com.mns.cda.suivimns.dao;

import com.mns.cda.suivimns.model.Status;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StatusDao extends JpaRepository<Status, Integer> {
}
