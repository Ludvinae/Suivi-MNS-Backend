package com.mns.cda.suivimns.controller;

import com.mns.cda.suivimns.dao.KnowledgeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KnowledgeController {

    protected KnowledgeDao knowledgeDao;

    @Autowired
    public KnowledgeController(KnowledgeDao knowledgeDao) {
        this.knowledgeDao = knowledgeDao;
    }
}
