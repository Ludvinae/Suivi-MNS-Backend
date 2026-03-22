package com.mns.cda.suivimns.controller;

import com.mns.cda.suivimns.dao.TicketDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TicketController {

    protected TicketDao ticketDao;

    @Autowired
    public TicketController(TicketDao ticketDao) {
        this.ticketDao = ticketDao;
    }
}
