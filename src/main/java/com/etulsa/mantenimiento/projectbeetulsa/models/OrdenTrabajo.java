package com.etulsa.mantenimiento.projectbeetulsa.models;

/**
 * @author Senior Software Development Consultant Jordan Vicaña Alburqueque on 3/3/2024
 * @project Project-be-ETULSA
 */
public class OrdenTrabajo {
    private Long id;
    private String descripcion;
    private Vehiculo vehiculo;
    private Tecnico tecnico;
    private EstadoOrdenTrabajo estadoOrdenTrabajo;
    private TipoServicio tipoServicio;
    private int prioridad;
}
