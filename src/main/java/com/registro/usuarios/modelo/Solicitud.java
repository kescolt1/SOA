package com.registro.usuarios.modelo;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "solicitud")
public class Solicitud {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long solicitudID;
    
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "proveedorID")
    private Proveedor proveedor;
    
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "evaluacionID")
    private Evaluacion evaluacion;
    
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "tipoSolicitud_ID")
    private TipoSolicitud tipoSolicitud;
    
    @Column(name = "solicitudFecha")
    private String solicitudFecha;

    // getters and setters
    
    public Solicitud() {
    }

	public Solicitud(Proveedor proveedor, Evaluacion evaluacion, TipoSolicitud tipoSolicitud, String solicitudFecha) {
		super();
		this.proveedor = proveedor;
		this.evaluacion = evaluacion;
		this.tipoSolicitud = tipoSolicitud;
		this.solicitudFecha = solicitudFecha;
	}

	public Solicitud(Long solicitudID, Proveedor proveedor, Evaluacion evaluacion, TipoSolicitud tipoSolicitud,
			String solicitudFecha) {
		super();
		this.solicitudID = solicitudID;
		this.proveedor = proveedor;
		this.evaluacion = evaluacion;
		this.tipoSolicitud = tipoSolicitud;
		this.solicitudFecha = solicitudFecha;
	}

	public Long getSolicitudID() {
		return solicitudID;
	}

	public void setSolicitudID(Long solicitudID) {
		this.solicitudID = solicitudID;
	}

	public Proveedor getProveedor() {
		return proveedor;
	}

	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
	}

	public Evaluacion getEvaluacion() {
		return evaluacion;
	}

	public void setEvaluacion(Evaluacion evaluacion) {
		this.evaluacion = evaluacion;
	}

	public TipoSolicitud getTipoSolicitud() {
		return tipoSolicitud;
	}

	public void setTipoSolicitud(TipoSolicitud tipoSolicitud) {
		this.tipoSolicitud = tipoSolicitud;
	}

	public String getSolicitudFecha() {
		return solicitudFecha;
	}

	public void setSolicitudFecha(String solicitudFecha) {
		this.solicitudFecha = solicitudFecha;
	}
}
