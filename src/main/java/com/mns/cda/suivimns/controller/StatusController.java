package com.mns.cda.suivimns.controller;

import com.mns.cda.suivimns.dao.StatusDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatusController {

    protected StatusDao statusDao;

    @Autowired
    public StatusController(StatusDao statusDao) {
        this.statusDao = statusDao;
    }
}
