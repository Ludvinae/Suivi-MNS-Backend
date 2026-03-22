package com.mns.cda.suivimns.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.Length;

import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Own {

    @Id
    @GeneratedValue
    private Integer idOwn;

    @ManyToMany
    @JoinTable(name = "own",
            joinColumns = @JoinColumn(name = "id_software"),
            inverseJoinColumns = @JoinColumn(name = "id_organisation"))
    protected List<Organisation> ownerList;

    @Column(nullable = false, length = 127)
    @NotBlank
    @Length(max = 127)
    protected String licenseNumber;

    protected LocalDateTime expirationDate;
}
