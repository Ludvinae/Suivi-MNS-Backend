package com.mns.cda.suivimns.model;

import com.mns.cda.suivimns.model.groups.OnCreate;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Software {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Integer idSoftware;

    @Column(nullable = false, length = 127)
    @NotBlank(groups = {OnCreate.class})
    @Length(min = 1, max = 127)
    protected String name;

    @Column(columnDefinition = "TEXT")
    protected String description;

    @ManyToOne
    @JoinColumn(name = "id_software_type")
    protected SoftwareType type;
}
