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
public class Knowledge {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Integer idKnowledge;

    @Column(nullable = false)
    @NotBlank(groups = {OnCreate.class, OnUpdate.class})
    @Length(max = 255)
    protected String subject;
}
