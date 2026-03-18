package com.mns.cda.suivimns.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class SoftwareType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Integer id_software_type;

    protected String designation;

}
