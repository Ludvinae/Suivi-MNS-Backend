package com.mns.cda.suivimns.dao;

import com.mns.cda.suivimns.model.Version;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VersionDao extends JpaRepository<Version, Integer> {
}
