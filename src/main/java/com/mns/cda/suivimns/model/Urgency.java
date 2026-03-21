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
public class Urgency {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Integer idUrgency;

    @Column(nullable = false, length = 63, unique = true)
    @NotBlank(groups = {OnCreate.class})
    @Length(max = 63)
    protected String designation;

    protected Integer priorityFactor;

    @Column(columnDefinition = "TEXT")
    protected String description;
}
