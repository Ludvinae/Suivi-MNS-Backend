package com.mns.cda.suivimns.model;

import com.mns.cda.suivimns.model.groups.OnCreate;
import com.mns.cda.suivimns.model.groups.OnUpdate;
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
public class Organisation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Integer idOrganisation;

    @Column(nullable = false, length = 127)
    @NotBlank(groups = {OnCreate.class})
    @Length(max = 127)
    protected String name;

    @Column(length = 127)
    @Length(max = 127)
    protected String domain;

    @Length(max = 255)
    protected String siretNumber;

    @ManyToOne
    @JoinColumn(name = "id_organisation_type")
    protected OrganisationType type;
}
