package com.registro.usuarios.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "evaluacion")
public class Evaluacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "evaluacion_id")
    private Long evaluacionID;

    @OneToOne
    private Usuario usuario;
    
    @OneToOne(mappedBy = "evaluacion")
    private Solicitud solicitud;

    @OneToMany(mappedBy = "evaluacion", fetch = FetchType.LAZY)
    private List<TipoEstado> tiposEstados;

    @Column(name = "evaluacion_fecha")
    private Date evaluacionFecha;

    @Column(name = "comentarios")
    private String comentarios;

    // ...

    public Long getEvaluacionID() {
        return evaluacionID;
    }

    public void setEvaluacionID(Long evaluacionID) {
        this.evaluacionID = evaluacionID;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<TipoEstado> getTiposEstados() {
        return tiposEstados;
    }

    public void setTiposEstados(List<TipoEstado> tiposEstados) {
        this.tiposEstados = tiposEstados;
    }

    public Date getEvaluacionFecha() {
        return evaluacionFecha;
    }

    public void setEvaluacionFecha(Date evaluacionFecha) {
        this.evaluacionFecha = evaluacionFecha;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }
    
    
    public Solicitud getSolicitud() {
		return solicitud;
	}

	public void setSolicitud(Solicitud solicitud) {
		this.solicitud = solicitud;
	}


    public Evaluacion(Usuario usuario, Solicitud solicitud, List<TipoEstado> tiposEstados, Date evaluacionFecha,
			String comentarios) {
		super();
		this.usuario = usuario;
		this.solicitud = solicitud;
		this.tiposEstados = tiposEstados;
		this.evaluacionFecha = evaluacionFecha;
		this.comentarios = comentarios;
	}

	public Evaluacion() {
    }
}