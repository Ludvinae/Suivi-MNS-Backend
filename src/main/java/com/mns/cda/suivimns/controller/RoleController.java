package com.mns.cda.suivimns.controller;

import com.mns.cda.suivimns.dao.RoleDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RoleController {

    protected RoleDao roleDao;

    @Autowired
    public RoleController(RoleDao roleDao) {
        this.roleDao = roleDao;
    }
}
