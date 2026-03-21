package com.mns.cda.suivimns.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import java.time.LocalDateTime;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Version {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Integer idVersion;

    @Column(nullable = false, length = 63)
    @NotBlank
    @Length(min = 1, max = 63)
    protected String versionNumber;


    protected LocalDateTime publicationDate;

    @ManyToOne
    @JoinColumn(name = "id_version_type")
    protected VersionType versionType;

    @ManyToOne
    @JoinColumn(name = "id_software")
    protected Software software;
}
