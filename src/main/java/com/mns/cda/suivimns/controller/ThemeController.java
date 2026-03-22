package com.mns.cda.suivimns.controller;

import com.mns.cda.suivimns.dao.ThemeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ThemeController {

    protected ThemeDao themeDao;

    @Autowired
    public ThemeController(ThemeDao themeDao) {
        this.themeDao = themeDao;
    }
}
