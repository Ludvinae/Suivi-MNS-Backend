package com.mns.cda.suivimns.controller;

import com.mns.cda.suivimns.dao.OrganisationTypeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrganisationTypeController {

    protected OrganisationTypeDao organisationTypeDao;

    @Autowired
    public OrganisationTypeController(OrganisationTypeDao organisationTypeDao) {
        this.organisationTypeDao = organisationTypeDao;
    }
}
