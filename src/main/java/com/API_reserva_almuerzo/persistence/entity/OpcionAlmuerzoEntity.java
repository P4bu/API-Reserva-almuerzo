package com.API_reserva_almuerzo.persistence.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "opcionalalmuerzo")
public class OpcionAlmuerzoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "oal_opcion", nullable = false)
    private int oalOpcion;

    @Column(name = "oal_fecha")
    @Id
    private Date oalFecha;

    @Column(name = "oal_nombre")
    private String oalNombre;

    public int getOalOpcion() {
        return oalOpcion;
    }

    public void setOalOpcion(int oalOpcion) {
        this.oalOpcion = oalOpcion;
    }

    public Date getOalFecha() {
        return oalFecha;
    }

    public void setOalFecha(Date oalFecha) {
        this.oalFecha = oalFecha;
    }

    public String getOalNombre() {
        return oalNombre;
    }

    public void setOalNombre(String oalNombre) {
        this.oalNombre = oalNombre;
    }

    public OpcionAlmuerzoEntity() {
    }

    public OpcionAlmuerzoEntity(Integer oalOpcion, Date oalFecha, String oalNombre) {
        this.oalOpcion = oalOpcion;
        this.oalFecha = oalFecha;
        this.oalNombre = oalNombre;
    }
}
