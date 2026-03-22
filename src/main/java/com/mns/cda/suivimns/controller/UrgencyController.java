package com.mns.cda.suivimns.controller;

import com.mns.cda.suivimns.dao.UrgencyDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UrgencyController {

    protected UrgencyDao urgencyDao;

    @Autowired
    public  UrgencyController(UrgencyDao urgencyDao) {
        this.urgencyDao = urgencyDao;
    }
}
