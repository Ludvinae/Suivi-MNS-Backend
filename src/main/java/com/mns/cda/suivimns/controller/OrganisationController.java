package com.mns.cda.suivimns.controller;

import com.mns.cda.suivimns.dao.OrganisationDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrganisationController {

    protected OrganisationDao organisationDao;

    @Autowired
    public OrganisationController(OrganisationDao organisationDao) {
        this.organisationDao = organisationDao;
    }
}
