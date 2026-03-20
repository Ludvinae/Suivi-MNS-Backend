package com.mns.cda.suivimns.controller;

import com.mns.cda.suivimns.dao.SoftwareTypeDao;
import com.mns.cda.suivimns.model.SoftwareType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class SoftwareTypeController {

    protected SoftwareTypeDao softwareTypeDao;

    @Autowired
    public SoftwareTypeController(SoftwareTypeDao softwareTypeDao) {
        this.softwareTypeDao = softwareTypeDao;
    }

    @GetMapping("/software-type/list")
    public List<SoftwareType> findAll() {
        return softwareTypeDao.findAll();
    }

    @GetMapping("/software-type/{id}")
    public ResponseEntity<SoftwareType> findById(@PathVariable Integer id) {

        Optional<SoftwareType> softwareType = softwareTypeDao.findById(id);

        if (softwareType.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(softwareType.get(), HttpStatus.OK);
    }

    @PostMapping("/software-type")
    public ResponseEntity<SoftwareType> create(@RequestBody SoftwareType typeToInsert) {

        typeToInsert.setId_software_type(null);
        softwareTypeDao.save(typeToInsert);

        return new ResponseEntity<>(typeToInsert, HttpStatus.CREATED);
    }

    @DeleteMapping("/software-type/{id}")
    public ResponseEntity<SoftwareType> delete(@PathVariable Integer id) {

        Optional<SoftwareType> softwareType = softwareTypeDao.findById(id);

        if (softwareType.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        softwareTypeDao.deleteById(id);

        return new ResponseEntity<>(softwareType.get(), HttpStatus.NO_CONTENT);
    }

    @PutMapping("/software-type/{id}")
    public ResponseEntity<SoftwareType> update(@PathVariable Integer id, @RequestBody SoftwareType typeToUpdate) {
        Optional<SoftwareType> softwareType = softwareTypeDao.findById(id);
        if (softwareType.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        typeToUpdate.setId_software_type(id);
        softwareTypeDao.save(typeToUpdate);

        return new ResponseEntity<>(typeToUpdate, HttpStatus.OK);
    }
}
