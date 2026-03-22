package com.mns.cda.suivimns.controller;

import com.mns.cda.suivimns.dao.HistoryDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HistoryController {

    protected HistoryDao historyDao;

    @Autowired
    public HistoryController(HistoryDao historyDao) {
        this.historyDao = historyDao;
    }
}
