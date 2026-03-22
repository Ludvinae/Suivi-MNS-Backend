package com.mns.cda.suivimns.controller;

import com.mns.cda.suivimns.dao.AssignmentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AssignmentController {

    protected AssignmentDao assignmentDao;

    @Autowired
    public AssignmentController(AssignmentDao assignmentDao) {
        this.assignmentDao = assignmentDao;
    }
}
