package com.mns.cda.suivimns.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Organisation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Integer idOrganisation;

    @Column(nullable = false, length = 127)
    @Length(max = 127)
    protected String name;

    @Column(nullable = false, length = 127)
    @Length(max = 127)
    protected String domain;

    protected String siretNumber;
}
