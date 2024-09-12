package com.API_reserva_almuerzo.persistence.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "visitaopcionalalmuerzo")
public class VisitaOpcionalAlmuerzoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "vis_codigo", nullable = false)
    private int visCodigo;

    @Id
    @Column(name = "oal_fecha")
    private Date oalFecha;

    @Column(name = "oal_opcion")
    private int oalOpcion;

    @Column(name = "voa_emergencia")
    private boolean voaEmergencia;

    @Column(name = "ofi_codigo")
    private int ofiCodigo;

    public int getVisCodigo() {
        return visCodigo;
    }

    public void setVisCodigo(int visCodigo) {
        this.visCodigo = visCodigo;
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

    public boolean isVoaEmergencia() {
        return voaEmergencia;
    }

    public void setVoaEmergencia(boolean voaEmergencia) {
        this.voaEmergencia = voaEmergencia;
    }

    public int getOfiCodigo() {
        return ofiCodigo;
    }

    public void setOfiCodigo(int ofiCodigo) {
        this.ofiCodigo = ofiCodigo;
    }

    public VisitaOpcionalAlmuerzoEntity() {
    }

    public VisitaOpcionalAlmuerzoEntity(int visCodigo, Date oalFecha, int oalOpcion, boolean voaEmergencia, int ofiCodigo) {
        this.visCodigo = visCodigo;
        this.oalFecha = oalFecha;
        this.oalOpcion = oalOpcion;
        this.voaEmergencia = voaEmergencia;
        this.ofiCodigo = ofiCodigo;
    }
}
