package com.etulsa.mantenimiento.projectbeetulsa.models.entities;

import com.etulsa.mantenimiento.projectbeetulsa.models.EstadoVehiculo;
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
@Table(name = "vehiculo")
@Setter
@Getter
public class VehiculoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "vehiculo_id", nullable = false)
    private Long id;
    private String placa;
    private String padron;
    @Enumerated(value = EnumType.STRING)
    private EstadoVehiculo estado;

    @OneToMany(mappedBy = "vehiculoEntity")
    private List<OrdenTrabajoEntity> ordenTrabajoEntities;
}
