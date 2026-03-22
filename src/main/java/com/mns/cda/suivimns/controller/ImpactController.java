package com.mns.cda.suivimns.controller;

import com.mns.cda.suivimns.dao.ImpactDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ImpactController {

    protected ImpactDao impactDao;

    @Autowired
    public ImpactController(ImpactDao impactDao) {
        this.impactDao = impactDao;
    }
}
