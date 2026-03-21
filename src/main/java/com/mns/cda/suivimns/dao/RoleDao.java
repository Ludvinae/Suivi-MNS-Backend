package com.mns.cda.suivimns.dao;

import com.mns.cda.suivimns.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleDao extends JpaRepository<Role, Integer> {
}
