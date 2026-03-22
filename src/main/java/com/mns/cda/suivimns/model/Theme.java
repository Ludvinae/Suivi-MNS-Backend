package com.mns.cda.suivimns.model;

import com.mns.cda.suivimns.model.groups.OnCreate;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Theme {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Integer idTheme;

    @Column(nullable = false, length = 127, unique = true)
    @NotBlank(groups = {OnCreate.class})
    @Length(min = 3, max = 127)
    protected String designation;

    @Column(columnDefinition = "TEXT")
    protected String description;

    @Length(max = 3)
    protected Byte priorityFactor;

    @ManyToMany
    @JoinTable(name = "regroup",
            joinColumns = @JoinColumn(name = "id_ticket"),
            inverseJoinColumns = @JoinColumn(name = "id_theme"))
    protected List<Theme> themeList;
}
