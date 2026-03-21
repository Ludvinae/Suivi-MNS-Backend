package com.mns.cda.suivimns.model;

import com.mns.cda.suivimns.model.groups.OnCreate;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Integer idTicket;

    @CreationTimestamp
    protected LocalDateTime openDate;

    protected LocalDateTime closeDate;

    @UpdateTimestamp
    protected LocalDateTime modificationDate;

    @Lob
    @Column(nullable = false)
    @NotBlank(groups = {OnCreate.class})
    protected String description;

    protected Integer callDuration;

    @Column(nullable = false)
    @NotBlank(groups = {OnCreate.class})
    protected Integer initialPriority;

    protected Integer finalPriority;

}
