package com.mns.cda.suivimns.dao;

import com.mns.cda.suivimns.model.History;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HistoryDao extends JpaRepository<History, Integer> {
}
