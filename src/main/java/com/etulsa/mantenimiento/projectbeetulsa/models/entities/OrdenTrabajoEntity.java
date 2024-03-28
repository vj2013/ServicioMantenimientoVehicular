package com.etulsa.mantenimiento.projectbeetulsa.models.entities;

import com.etulsa.mantenimiento.projectbeetulsa.models.EstadoOrdenTrabajo;
import com.etulsa.mantenimiento.projectbeetulsa.models.TipoServicio;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

/**
 * @author Senior Software Development Consultant Jordan Vicaña Alburqueque on 3/3/2024
 * @project Project-be-ETULSA
 */
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "orden_trabajo")
public class OrdenTrabajoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "orden_trabajo_id", nullable = false)
    private Long id;
    private String descripcion;
    @Enumerated(value = EnumType.STRING)
    private EstadoOrdenTrabajo estadoOrdenTrabajo;
    private TipoServicio tipoServicio;
    private int prioridad;
    private String fechaCreacion;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "sede_id", nullable = false)
    private SedeEntity sedeEntity;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "vehiculo_id", nullable = false)
    private VehiculoEntity vehiculoEntity;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "tecnico_id", nullable = false)
    private TecnicoEntity tecnicoEntity;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ficha_mantenimiento_id")
    private FichaMantenimientoEntity fichaMantenimientoEntity;
}
