package com.mns.cda.suivimns.controller;

import com.mns.cda.suivimns.dao.VersionDao;
import com.mns.cda.suivimns.model.Version;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class VersionController {

    @Autowired
    private VersionDao versionDao;

    @GetMapping("/version/list")
    public List<Version> findAll() {
        return versionDao.findAll();
    }

    @GetMapping("/version/{id}")
    public ResponseEntity<Version> findById(@PathVariable Integer id) {

        Optional<Version> version = versionDao.findById(id);
        if (version.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(version.get(), HttpStatus.OK);
    }

    @PostMapping("/version")
    public ResponseEntity<Version> save(@RequestBody Version version) {

        version.setId_version(null);

        versionDao.save(version);
        return new ResponseEntity<>(version, HttpStatus.CREATED);
    }

    @DeleteMapping("/version/{id}")
    public ResponseEntity<Version> delete(@PathVariable Integer id) {

        Optional<Version> version = versionDao.findById(id);
        if (version.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        versionDao.deleteById(id);
        return new ResponseEntity<>(version.get(), HttpStatus.NO_CONTENT);
    }

    @PutMapping("/version/{id}")
    public ResponseEntity<Version> update(@PathVariable Integer id, @RequestBody Version versionToModify) {
        Optional<Version> version = versionDao.findById(id);
        if (version.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        versionToModify.setId_version(id);
        versionDao.save(versionToModify);

        return new ResponseEntity<>(versionToModify, HttpStatus.NO_CONTENT);
    }
}
