package com.API_reserva_almuerzo.persistence.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "trabajadoropcionalalmuerzo")
public class TrabajadorOpcionalAlmuerzoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tra_codigo")
    private int traCodigo;

    @Id
    @Column(name = "oal_fecha")
    private Date oalFecha;

    @Column(name = "oal_opcion")
    private int oalOpcion;

    @Column(name = "toa_ip")
    private String toaIp;

    @Column(name = "toa_emergencia")
    private boolean toaEmergencia;

    @Column(name = "codigo_oficina")
    private int codigoOficina;

    public int getTraCodigo() {
        return traCodigo;
    }

    public void setTraCodigo(int traCodigo) {
        this.traCodigo = traCodigo;
    }

    public Date getOalFecha() {
        return oalFecha;
    }

    public void setOalFecha(Date oalFecha) {
        this.oalFecha = oalFecha;
    }

    public int getOalOpcion() {
        return oalOpcion;
    }

    public void setOalOpcion(int oalOpcion) {
        this.oalOpcion = oalOpcion;
    }

    public String getToaIp() {
        return toaIp;
    }

    public void setToaIp(String toaIp) {
        this.toaIp = toaIp;
    }

    public boolean isToaEmergencia() {
        return toaEmergencia;
    }

    public void setToaEmergencia(boolean toaEmergencia) {
        this.toaEmergencia = toaEmergencia;
    }

    public int getCodigoOficina() {
        return codigoOficina;
    }

    public void setCodigoOficina(int codigoOficina) {
        this.codigoOficina = codigoOficina;
    }

    public TrabajadorOpcionalAlmuerzoEntity() {
    }

    public TrabajadorOpcionalAlmuerzoEntity(int traCodigo, Date oalFecha, int oalOpcion, String toaIp, boolean toaEmergencia, int codigoOficina) {
        this.traCodigo = traCodigo;
        this.oalFecha = oalFecha;
        this.oalOpcion = oalOpcion;
        this.toaIp = toaIp;
        this.toaEmergencia = toaEmergencia;
        this.codigoOficina = codigoOficina;
    }
}
