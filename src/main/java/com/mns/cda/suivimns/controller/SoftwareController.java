package com.mns.cda.suivimns.controller;

import com.mns.cda.suivimns.dao.SoftwareDao;
import com.mns.cda.suivimns.model.Software;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class SoftwareController {

    @Autowired
    protected SoftwareDao softwareDao;

    @GetMapping("/software/list")
    public List<Software> getAll() {
        return softwareDao.findAll();
    }

    @GetMapping("/software/{id}")
    public ResponseEntity<Software> getById(@PathVariable Integer id) {
        Optional<Software> software = softwareDao.findById(id);

        if (software.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(software.get(), HttpStatus.OK);
    }

    @PostMapping("/software")
    public ResponseEntity<Software> create(@RequestBody Software software) {
        software.setId_software(null);
        softwareDao.save(software);

        return new ResponseEntity<>(software, HttpStatus.CREATED);
    }

    @DeleteMapping("/software/{id}")
    public ResponseEntity<Software> delete(@PathVariable Integer id) {
        Optional<Software> software = softwareDao.findById(id);
        if (software.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        softwareDao.delete(software.get());
        return new ResponseEntity<>(software.get(), HttpStatus.NO_CONTENT);
    }

    @PutMapping("/software/{id}")
    public ResponseEntity<Software> update(@PathVariable Integer id, @RequestBody Software softwareData) {
        Optional<Software> software = softwareDao.findById(id);

        if(software.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        softwareData.setId_software(id);
        softwareDao.save(softwareData);
        return new ResponseEntity<>(software.get(), HttpStatus.OK);
    }
}
