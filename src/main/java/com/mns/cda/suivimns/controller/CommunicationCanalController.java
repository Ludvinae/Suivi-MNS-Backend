package com.mns.cda.suivimns.controller;

import com.mns.cda.suivimns.dao.CommunicationCanalDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommunicationCanalController {

    protected CommunicationCanalDao communicationCanalDao;

    @Autowired
    public CommunicationCanalController(CommunicationCanalDao communicationCanalDao) {
        this.communicationCanalDao = communicationCanalDao;
    }
}
