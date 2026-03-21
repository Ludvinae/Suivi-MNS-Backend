package com.mns.cda.suivimns.dao;

import com.mns.cda.suivimns.model.Organisation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrganisationDao extends JpaRepository<Organisation, Integer> {
}
