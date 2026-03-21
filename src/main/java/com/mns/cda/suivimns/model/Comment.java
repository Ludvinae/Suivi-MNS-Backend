package com.mns.cda.suivimns.model;

import com.mns.cda.suivimns.model.groups.OnCreate;
import com.mns.cda.suivimns.model.groups.OnUpdate;
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
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Integer idComment;

    @Column(nullable = false, columnDefinition = "TEXT")
    @NotBlank(groups = {OnCreate.class,  OnUpdate.class})
    protected String content;

    @CreationTimestamp
    @Column(updatable = false)
    protected LocalDateTime dateSent;

    @UpdateTimestamp
    protected LocalDateTime lastModification;

    @ManyToOne
    @JoinColumn(name = "id_ticket")
    protected Ticket ticket;

    @ManyToOne
    @JoinColumn(name = "id_employee")
    protected Employee employee;

    @ManyToOne
    @JoinColumn(name = "id_client")
    protected Client client;

}
