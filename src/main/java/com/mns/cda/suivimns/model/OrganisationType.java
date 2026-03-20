package com.mns.cda.suivimns.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
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
public class OrganisationType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Integer idOrganisationType;

    @Column(nullable = false, length = 127)
    @NotBlank
    @Length(max = 127)
    protected String designation;
}
