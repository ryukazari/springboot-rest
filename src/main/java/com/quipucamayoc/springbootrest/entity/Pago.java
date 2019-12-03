package com.quipucamayoc.springbootrest.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "tp_pago", schema = "qpsirbanco")
public class Pago implements Serializable {
    @Id
    @Column(name = "id_pago")
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "sequence")
    @SequenceGenerator(name = "sequence", sequenceName = "tp_pago_id_seq")
    private Long id_pago;

    @Column (name = "fk_usuario")
    private Integer  fk_usuario;

    @Column (name = "fk_banco")
    private Integer fk_banco;

    @Column (name = "fk_estado")
    private Integer fk_estado;

    @Column (name = "fecha_vencimiento")
    private Date fecha_vencimiento;

    @Column (name = "contrapartida")
    private String contrapartida;

    @Column (name = "referencia_adicional")
    private String referencia_adicional;

    @Column (name = "moneda_importe")
    private String moneda_importe;

    @Column (name = "codigo_pago")
    private String codigo_pago;

    @Column (name = "fecha_pago")
    private String fecha_pago;

    @Column (name = "codigo_operacion_banco")
    private String codigo_operacion_banco;

    @Column (name = "canal_banco")
    private String canal_banco;

    @Column (name = "hora_pago")
    private String hora_pago;

    //@Column (name = "monto")
    private Float monto;

    public Long getId_pago() {
        return id_pago;
    }

    public void setId_pago(Long id_pago) {
        this.id_pago = id_pago;
    }

    public Integer getFk_usuario() {
        return fk_usuario;
    }

    public void setFk_usuario(Integer fk_usuario) {
        this.fk_usuario = fk_usuario;
    }

    public Integer getFk_banco() {
        return fk_banco;
    }

    public void setFk_banco(Integer fk_banco) {
        this.fk_banco = fk_banco;
    }

    public Integer getFk_estado() {
        return fk_estado;
    }

    public void setFk_estado(Integer fk_estado) {
        this.fk_estado = fk_estado;
    }

    public Date getFecha_vencimiento() {
        return fecha_vencimiento;
    }

    public void setFecha_vencimiento(Date fecha_vencimiento) {
        this.fecha_vencimiento = fecha_vencimiento;
    }

    public String getContrapartida() {
        return contrapartida;
    }

    public void setContrapartida(String contrapartida) {
        this.contrapartida = contrapartida;
    }

    public String getReferencia_adicional() {
        return referencia_adicional;
    }

    public void setReferencia_adicional(String referencia_adicional) {
        this.referencia_adicional = referencia_adicional;
    }

    public String getMoneda_importe() {
        return moneda_importe;
    }

    public void setMoneda_importe(String moneda_importe) {
        this.moneda_importe = moneda_importe;
    }

    public String getCodigo_pago() {
        return codigo_pago;
    }

    public void setCodigo_pago(String codigo_pago) {
        this.codigo_pago = codigo_pago;
    }

    public String getFecha_pago() {
        return fecha_pago;
    }

    public void setFecha_pago(String fecha_pago) {
        this.fecha_pago = fecha_pago;
    }

    public String getCodigo_operacion_banco() {
        return codigo_operacion_banco;
    }

    public void setCodigo_operacion_banco(String codigo_operacion_banco) {
        this.codigo_operacion_banco = codigo_operacion_banco;
    }

    public String getCanal_banco() {
        return canal_banco;
    }

    public void setCanal_banco(String canal_banco) {
        this.canal_banco = canal_banco;
    }

    public String getHora_pago() {
        return hora_pago;
    }

    public void setHora_pago(String hora_pago) {
        this.hora_pago = hora_pago;
    }

    public Float getMonto() {
        return monto;
    }

    public void setMonto(Float monto) {
        this.monto = monto;
    }
}
