package com.mns.cda.suivimns.dao;

import com.mns.cda.suivimns.model.Knowledge;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KnowledgeDao extends JpaRepository<Knowledge, Integer> {
}
