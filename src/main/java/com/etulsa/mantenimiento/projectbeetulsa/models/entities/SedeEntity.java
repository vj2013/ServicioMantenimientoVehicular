package com.etulsa.mantenimiento.projectbeetulsa.models.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

/**
 * @author Senior Software Development Consultant Jordan Vicaña Alburqueque on 3/3/2024
 * @project Project-be-ETULSA
 */
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "sede")
@Getter
@Setter
public class SedeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sede_id", nullable = false)
    private Long id;
    private String description;
    private String estado;

    @OneToMany(mappedBy = "sedeEntity")
    private List<OrdenTrabajoEntity> ordenTrabajoEntities;
}
