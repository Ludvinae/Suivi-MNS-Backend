package com.mns.cda.suivimns.model;

import com.mns.cda.suivimns.model.groups.OnCreate;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
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
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Integer idEmployee;

    @Column(nullable = false, length = 127)
    @NotBlank(groups = {OnCreate.class})
    @Length(max = 127)
    protected String firstName;

    @Column(nullable = false, length = 127)
    @NotBlank(groups = {OnCreate.class})
    @Length(max = 127)
    protected String lastName;

    @Column(length = 127)
    @Email(groups = {OnCreate.class})
    @Length(max = 127)
    protected String email;

    @Column(length = 31)
    @Length(max = 31)
    protected String phoneNumber;

    @Column(nullable = false, length = 127)
    @NotBlank(groups = {OnCreate.class})
    @Length(max = 127)
    protected String password;

    @ManyToOne
    @JoinColumn(name = "id_role")
    protected Role role;
}
