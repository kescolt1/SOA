package com.registro.usuarios.modelo;


import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;

import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tipo_solicitud")
public class TipoSolicitud {
    @Id
    private Long id;
    
    @Column(name = "tipoSolicitud")
    private String tipoSolicitud;
    
    @OneToMany(mappedBy = "tipoSolicitud")
    private Collection<Solicitud> solicitudes;
    
    @OneToOne(mappedBy = "tipoSolicitud")
    private Solicitud solicitud;
    // Constructor, getters y setters

    public TipoSolicitud() {
    }

    public TipoSolicitud(Long id, String tipoSolicitud) {
        this.id = id;
        this.tipoSolicitud = tipoSolicitud;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipoSolicitud() {
        return tipoSolicitud;
    }

    public void setTipoSolicitud(String tipoSolicitud) {
        this.tipoSolicitud = tipoSolicitud;
    }

    public Collection<Solicitud> getSolicitudes() {
        return solicitudes;
    }

    public void setSolicitudes(Collection<Solicitud> solicitudes) {
        this.solicitudes = solicitudes;
    }
}

    

	
	
			

