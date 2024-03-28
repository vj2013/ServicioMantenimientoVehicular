package com.etulsa.mantenimiento.projectbeetulsa.models.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.Set;

/**
 * @author Senior Software Development Consultant Jordan Vicaña Alburqueque on 3/3/2024
 * @project Project-be-ETULSA
 */
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Getter
@Setter
@Table(name = "tecnico")
public class TecnicoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tecnico_id", nullable = false)
    private Long id;
    private String dni;
    private String nombres;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String cargo;
    private String estado;

    @OneToMany(mappedBy = "tecnicoEntity")
    private List<OrdenTrabajoEntity> ordenTrabajoEntities;

/*    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "TECNICO_SEDE",
    joinColumns = {
            @JoinColumn(name = "tecnico_id", referencedColumnName = "id")
    },
    inverseJoinColumns = {
            @JoinColumn(name = "sede_id", referencedColumnName = "id")
    }
    )
    private Set<SedeEntity> sedes;*/

}
