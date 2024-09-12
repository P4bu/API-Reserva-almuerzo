package com.API_reserva_almuerzo.persistence.entity;


import jakarta.persistence.*;

@Table(name = "tipoalmuerzo")
@Entity
public class TipoAlmuerzoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tal_codigo", nullable = false)
    private int talCodigo;

    @Column(name = "tal_nombre")
    private String talNombre;

    public int getTalCodigo() {
        return talCodigo;
    }

    public void setTalCodigo(int talCodigo) {
        this.talCodigo = talCodigo;
    }

    public String getTalNombre() {
        return talNombre;
    }

    public void setTalNombre(String talNombre) {
        this.talNombre = talNombre;
    }

    public TipoAlmuerzoEntity() {
    }

    public TipoAlmuerzoEntity(Integer talCodigo, String talNombre) {
        this.talCodigo = talCodigo;
        this.talNombre = talNombre;
    }



}
