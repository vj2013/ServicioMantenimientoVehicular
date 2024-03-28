package com.etulsa.mantenimiento.projectbeetulsa.models.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.*;

/**
 * @author Senior Software Development Consultant Jordan Vicaña Alburqueque on 3/3/2024
 * @project Project-be-ETULSA
 */
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "ficha_mantenimiento")
public class FichaMantenimientoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ficha_mantenimiento_id", nullable = false)
    private Long id;
    private String fechaRegistro;

    @OneToMany(mappedBy = "fichaMantenimientoEntity")
    private List<OrdenTrabajoEntity> ordenTrabajoEntities;

}
